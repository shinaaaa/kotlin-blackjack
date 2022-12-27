package blackjack.domain.participant.vo

@JvmInline
value class Score(val value: Int) : Comparable<Score> {

    operator fun plus(other: Score): Score {
        return Score(value.plus(other.value))
    }

    operator fun minus(other: Score): Score {
        return Score(value.minus(other.value))
    }

    companion object {
        fun of(value: Int): Score {
            return Score(value)
        }
    }

    override fun compareTo(other: Score): Int {
        return when {
            this.value > other.value -> 1
            this.value < other.value -> -1
            else -> 0
        }
    }
}
