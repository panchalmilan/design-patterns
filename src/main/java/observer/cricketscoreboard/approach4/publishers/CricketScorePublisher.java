package observer.cricketscoreboard.approach4.publishers;

import lombok.Getter;
import observer.cricketscoreboard.approach4.subscribers.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class CricketScorePublisher implements Publisher {
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

    @Override
    public void notifyAll(int runs, float overs, int wickets) {
        this.runs = runs;
        this.overs = overs;
        this.wickets = wickets;
        for(Subscriber subscriber: subscribers) {
            subscriber.update(runs, overs, wickets);
        }
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        this.subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        this.subscribers.remove(subscriber);
        System.out.println("\n" + "Subscriber: " + subscriber.getClass().getSimpleName() + " has unsubscribed itself from Publisher: " + this.getClass().getSimpleName() + "\n");
    }
}
