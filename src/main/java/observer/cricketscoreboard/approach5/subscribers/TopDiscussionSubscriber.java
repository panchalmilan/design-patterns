package observer.cricketscoreboard.approach5.subscribers;

import lombok.Getter;
import observer.cricketscoreboard.approach5.publishers.Publisher;

public class TopDiscussionSubscriber implements Subscriber {
    @Getter
    private int runs;

    @Getter
    private float overs;

    @Getter
    private int wickets;

    @Getter
    private final Publisher publisher;

    public TopDiscussionSubscriber(Publisher publisher) {
        this.publisher = publisher;
    }

    @Override
    public void update() {
        this.runs = publisher.getRuns();
        this.overs = publisher.getOvers();
        this.wickets = publisher.getWickets();
        // logic to persist detail in DB
        // algorithm to compute projected score
        // logic to update the board display
        System.out.println("TopDiscussionSubscriber: Runs: " + runs + ", Overs: " + overs + ", wickets: " + wickets);
    }
}