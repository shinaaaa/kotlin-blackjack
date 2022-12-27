package blackjack.domain.participant

class OwnWinScore {
    private var _winScores = mutableListOf<WinScore>()
    val winScores: List<WinScore>
        get() = _winScores.toList()

    fun add(winScore: WinScore) {
        _winScores.add(winScore)
    }
}
