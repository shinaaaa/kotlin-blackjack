package blackjack.domain.participant.vo

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

internal class NameTest {

    @Test
    @DisplayName("입력 값 홍길동을 넣을 경우 홍길동이라고 나옴")
    fun `If you put 홍길동, it says 홍길동`() {
        val value = "홍길동"
        val name = Name.of(value)

        name.value shouldBe value
    }
}
