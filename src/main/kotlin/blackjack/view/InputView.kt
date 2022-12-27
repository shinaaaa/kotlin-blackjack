package blackjack.view

import blackjack.domain.participant.vo.Name
import blackjack.dto.PlayerResult
import blackjack.dto.StayResult

object InputView {

    fun enterNameOfPlayer(): PlayerResult {
        println("게임에 참여할 사람의 이름을 입력하세요.(쉼표 기준으로 분리)")
        val players = readlnOrNull() ?: throw IllegalArgumentException("값을 입력하세요.")

        return PlayerResult(players)
    }

    fun stay(name: Name): StayResult {
        println("${name.value}는 한장의 카드를 더 받겠습니까?(예는 y, 아니오는 n)")
        val answer = readln()
        return runCatching { StayResult(answer) }
            .fold(
                onSuccess = { it },
                onFailure = { stay(name) }
            )
    }
}
