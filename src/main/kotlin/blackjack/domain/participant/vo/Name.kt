package blackjack.domain.participant.vo

@JvmInline
value class Name(val value: String) {

    companion object {
        fun of(value: String): Name {
            return Name(value)
        }
    }
}
