package observer.cricketscoreboard.approach7.publishers;

import lombok.Getter;
import observer.cricketscoreboard.approach7.subscribers.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class SonyCricketScorePublisher implements Publisher {
    @Getter
    private final PublishersEnum name = PublishersEnum.SONY;

    @Getter
    private int runs;

    @Getter
    private float overs;

    @Getter
    private int wickets;

    private final List<Subscriber> subscribers;

    public SonyCricketScorePublisher() {
        this.subscribers = new ArrayList<>();
    }

    // Publisher will use this function to notify all it's subscribers of the change
    @Override
    public void notifyAll(int runs, float overs, int wickets) {
        this.runs = runs;
        this.overs = overs;
        this.wickets = wickets;
        for(Subscriber subscriber: subscribers) {
            subscriber.update(this);
        }
    }

    // This is a class provided by Publisher to Subscriber, that Subscriber can subscribe itself to me(Publisher)
    @Override
    public void subscribe(Subscriber subscriber) {
        this.subscribers.add(subscriber);
        System.out.println("Subscriber: " + subscriber.getClass().getSimpleName() + " has subscribed itself to Publisher: " + this.getName());
    }

    // This is a class provided by Publisher to Subscriber, that Subscriber can unsubscribe itself from me(Publisher)
    @Override
    public void unsubscribe(Subscriber subscriber) {
        this.subscribers.remove(subscriber);
        System.out.println("Subscriber: " + subscriber.getClass().getSimpleName() + " has unsubscribed itself from Publisher: " + this.getName());
    }
}

