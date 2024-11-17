package observer.cricketscoreboard.approach3;

import lombok.Getter;
import observer.cricketscoreboard.approach3.subscribers.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class CricketScorePublisher {
    @Getter
    private int runs;

    @Getter
    private float overs;

    @Getter
    private int wickets;

    private final List<Subscriber> subscribers;

    public CricketScorePublisher() {
        this.subscribers = new ArrayList<>();
    }

    public void notifyAll(int runs, float overs, int wickets) {
        this.runs = runs;
        this.overs = overs;
        this.wickets = wickets;
        for(Subscriber subscriber: subscribers) {
            subscriber.update(runs, overs, wickets);
        }
    }

    // Subscriber can itself subscribe
    public void subscribe(Subscriber subscriber) {
        this.subscribers.add(subscriber);
    }

    // Subscriber can itself unsubscribe
    public void unsubscribe(Subscriber subscriber) {
        this.subscribers.remove(subscriber);
    }
}
