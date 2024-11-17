package observer.cricketscoreboard.approach2;

import lombok.Getter;
import observer.cricketscoreboard.approach2.analytics.ProjectedScoreBoard;

public class CricketScoreBoard {
    @Getter
    private int runs;

    @Getter
    private float overs;

    @Getter
    private int wickets;

    private final ProjectedScoreBoard projectedScoreBoard;

    public CricketScoreBoard(ProjectedScoreBoard projectedScoreBoard) {
        this.projectedScoreBoard = projectedScoreBoard;
    }

    public void updateScore(int runs, float overs, int wickets) {
        this.runs = runs;
        this.overs = overs;
        this.wickets = wickets;
        this.projectedScoreBoard.update(runs, overs, wickets);
    }
}
