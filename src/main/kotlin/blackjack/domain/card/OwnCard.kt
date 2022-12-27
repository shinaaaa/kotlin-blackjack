package blackjack.domain.card

import blackjack.domain.BlackJack
import blackjack.domain.participant.vo.Score
import kotlin.math.abs

class OwnCard(cards: List<Card> = emptyList()) {
    private val _cards: MutableList<Card> = cards.toMutableList()

    val cards: List<Card>
        get() = _cards.toList()

    private var score: Score = Score.of(0)

    fun add(card: Card) {
        _cards.add(card)
        score += card.number.value
    }

    private fun countNumberOfAce(): Int {
        return this.cards.count { it.number is Ace }
    }

    fun getFinalScore(): Score {
        val numberOfAce = countNumberOfAce()
        if (numberOfAce == 0) return score

        repeat(numberOfAce) {
            val plusScore = score.plus(Ace().aceValue.minus(Ace().value))
            if (plusScore > BlackJack.WIN_SCORE) return@repeat
            val absScore = abs((score - BlackJack.WIN_SCORE).value)
            val absPlusScore = abs((plusScore - BlackJack.WIN_SCORE).value)
            if (absScore < absPlusScore) return@repeat
            score = plusScore
        }
        return score
    }
}
