package blackjack.domain.participant

import io.kotest.matchers.collections.shouldContain
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class OwnWinScoreTest {

    @Test
    @DisplayName("입력 값이 Win일 경우 Win을 포함")
    fun `Include Win if input value is Win`() {
        val ownWinScore = OwnWinScore()
        ownWinScore.add(WinScore.WIN)

        ownWinScore.winScores shouldContain WinScore.WIN
    }
}
