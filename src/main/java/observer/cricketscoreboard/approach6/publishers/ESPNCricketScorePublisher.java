package observer.cricketscoreboard.approach6.publishers;

import lombok.Getter;
import observer.cricketscoreboard.approach6.subscribers.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class ESPNCricketScorePublisher implements Publisher {
    @Getter
    private final PublishersEnum name = PublishersEnum.ESPN;

    @Getter
    private int runs;

    @Getter
    private float overs;

    @Getter
    private int wickets;

    private final List<Subscriber> subscribers;

    public ESPNCricketScorePublisher() {
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

