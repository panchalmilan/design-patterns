package observer.cricketscoreboard.approach3.subscribers;

import observer.cricketscoreboard.approach3.CricketScorePublisher;

public class RunRateSubscriber implements Subscriber {
    private int runs;
    private float overs;
    private int wickets;

    // this is needed as Subscriber will need to subscribe to Publisher
    private final CricketScorePublisher cricketScorePublisher;

    public RunRateSubscriber(CricketScorePublisher cricketScorePublisher) {
        this.cricketScorePublisher = cricketScorePublisher;
    }

    @Override
    public void update(int runs, float overs, int wickets) {
        this.runs = runs;
        this.overs = overs;
        this.wickets = wickets;
        // logic to persist detail in DB
        // algorithm to compute projected score
        // logic to update the board display
    }
}