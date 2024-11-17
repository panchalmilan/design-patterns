package observer.cricketscoreboard.approach4.subscribers;

import observer.cricketscoreboard.approach4.publishers.Publisher;

public class TopDiscussionSubscriber implements Subscriber {
    private int runs;
    private float overs;
    private int wickets;
    // this is needed as Subscriber will need to subscribe to Publisher
    private final Publisher publisher;

    public TopDiscussionSubscriber(Publisher publisher) {
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