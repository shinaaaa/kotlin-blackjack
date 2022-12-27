package blackjack.domain.participant

enum class WinScore(val value: Int, val text: String) {
    WIN(1, "승"),
    LOSS(-1, "패"),
    DRAW(0, "무");

    companion object {
        fun of(value: Int): WinScore {
            return WinScore.values().first { it.value == value }
        }
    }
}
