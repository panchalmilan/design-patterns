package observer.cricketscoreboard.approach4.subscribers;

import lombok.Getter;
import observer.cricketscoreboard.approach4.publishers.Publisher;

public class ProjectedScoreSubscriber implements Subscriber {
    @Getter
    private int runs;

    @Getter
    private float overs;

    @Getter
    private int wickets;

    // this is needed as Subscriber will need to subscribe to Publisher
    @Getter
    private final Publisher publisher;

    public ProjectedScoreSubscriber(Publisher publisher) {
        this.publisher = publisher;
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