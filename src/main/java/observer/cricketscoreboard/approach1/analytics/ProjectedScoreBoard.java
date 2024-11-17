package observer.cricketscoreboard.approach1.analytics;

import observer.cricketscoreboard.approach1.CricketScoreBoard;

public class ProjectedScoreBoard {
    private int runs;
    private float overs;
    private int wickets;
    private final CricketScoreBoard cricketScoreBoard; // here cricketScoreBoard is PUBLISHER - publishing runs, wickets & overs

    public ProjectedScoreBoard(CricketScoreBoard cricketScoreBoard) {
        this.cricketScoreBoard = cricketScoreBoard;
    }

    public void update(int runs, float overs, int wickets) {
        while(true) {
            boolean isUpdated = false;
            // we are polling runs, overs, wickets from CricketScoreBoard
            // runs
            int updatedRuns = this.cricketScoreBoard.getRuns();
            if(updatedRuns != this.runs) {
                this.runs = updatedRuns;
                isUpdated = true;
            }
            // overs
            float updatedOvers = this.cricketScoreBoard.getOvers();
            if(updatedOvers != this.overs) {
                this.overs = updatedOvers;
                isUpdated = true;
            }
            // wickets
            int updatedWickets = this.cricketScoreBoard.getWickets();
            if(updatedWickets != this.wickets) {
                this.wickets = updatedWickets;
                isUpdated = true;
            }
            if(isUpdated) {
                // logic to persist detail in DB
                // algorithm to compute projected score
                // logic to update the board display
            }
        }
    }
}

/**
 *
 */