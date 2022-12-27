package blackjack.domain.card

import blackjack.domain.participant.vo.Score
import io.kotest.matchers.collections.shouldContain
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

internal class OwnCardTest {

    @Test
    @DisplayName("카드 2스페이스를 추가할 경우 카드 뭉치에 2스페이스가 포함되어 있음")
    fun `If you add card 2 spaces, the card bundle contains 2 spaces`() {
        val ownCard = OwnCard()
        val card = Card(Two(), CardType.SPADES)
        ownCard.add(card)

        ownCard.cards shouldContain card
    }

    @Test
    @DisplayName("카드 2스페이스와 10스페이스를 추가할 경우 카드의 총 점수는 12")
    fun `If you add 2 and 10 spaces of the card, the total score for the card is 12`() {
        val ownCard = OwnCard()
        ownCard.add(Card(Two(), CardType.SPADES))
        ownCard.add(Card(Ten(), CardType.SPADES))

        ownCard.getFinalScore() shouldBe Score.of(12)
    }
}
