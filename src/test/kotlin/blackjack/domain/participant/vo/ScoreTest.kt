package blackjack.domain.participant.vo

import io.kotest.matchers.comparables.shouldBeLessThan
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

internal class ScoreTest {

    @Test
    @DisplayName("입력 값 10을 넣을 경우 10")
    fun `If you enter an input value of 10, 10`() {
        val value = 10
        val score = Score.of(value)

        score.value shouldBe 10
    }

    @Test
    @DisplayName("스코어 10과 스코어 20을 더할 경우 값은 30")
    fun `If score 10 and score 20 are added, the value is 30`() {
        val score1 = Score.of(10)
        val score2 = Score.of(20)
        val plusScore = score1 + score2

        plusScore.value shouldBe 30
    }

    @Test
    @DisplayName("스코어 10과 스코어 20을 뺄 경우 값은 -10")
    fun `If score 10 and score 20 are subtracted, the value is -10`() {
        val score1 = Score.of(10)
        val score2 = Score.of(20)
        val minusScore = score1 - score2

        minusScore.value shouldBe -10
    }

    @Test
    @DisplayName("스코어 10이 스코어 20보다 작음")
    fun `Score 10 is less than Score 20`() {
        val score1 = Score.of(10)
        val score2 = Score.of(20)

        score1 shouldBeLessThan score2
    }
}
