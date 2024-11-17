package observer.cricketscoreboard.approach2.analytics;

public class ProjectedScoreBoard {
    private int runs;
    private float overs;
    private int wickets;

    public void update(int runs, float overs, int wickets) {
        this.runs = runs;
        this.overs = overs;
        this.wickets = wickets;
        // logic to persist detail in DB
        // algorithm to compute projected score
        // logic to update the board display
    }
}