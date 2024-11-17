package observer.cricketscoreboard.approach1;

import lombok.Getter;

public class CricketScoreBoard {
    @Getter
    private int runs;

    @Getter
    private float overs;

    @Getter
    private int wickets;

    public void updateScore(int runs, float overs, int wickets) {
        this.runs = runs;
        this.overs = overs;
        this.wickets = wickets;
    }
}
