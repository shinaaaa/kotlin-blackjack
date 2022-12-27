package blackjack.domain.card

import blackjack.domain.participant.vo.Score

sealed class CardNumber(val text: String, val value: Score)

class Ace : CardNumber("A", Score.of(1)) {
    val aceValue = Score.of(11)
}

class Two : CardNumber("2", Score.of(2))

class Three : CardNumber("3", Score.of(3))

class Four : CardNumber("4", Score.of(4))

class Five : CardNumber("5", Score.of(5))

class Six : CardNumber("6", Score.of(6))

class Seven : CardNumber("7", Score.of(7))

class Eight : CardNumber("8", Score.of(8))

class Nine : CardNumber("9", Score.of(9))

class Ten : CardNumber("10", Score.of(10))

class King : CardNumber("K", Score.of(10))

class Queen : CardNumber("Q", Score.of(10))

class Jack : CardNumber("J", Score.of(10))
