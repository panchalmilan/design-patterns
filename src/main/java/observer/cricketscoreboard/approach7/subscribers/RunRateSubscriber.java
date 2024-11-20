package observer.cricketscoreboard.approach7.subscribers;

import lombok.Getter;
import observer.cricketscoreboard.approach7.publishers.Publisher;
import observer.cricketscoreboard.approach7.publishers.PublishersEnum;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class RunRateSubscriber implements Subscriber {
    @Getter
    private int runs;

    @Getter
    private float overs;

    @Getter
    private Map<PublishersEnum, Publisher> publishers;

    public RunRateSubscriber(List<Publisher> publishers) {
//        System.out.println("\t\trunning RunRateSubscriber's constructor...");
        this.publishers = new EnumMap<>(PublishersEnum.class);
        for (Publisher publisher: publishers) {
            publisher.subscribe(this);
            this.publishers.put(publisher.getName(), publisher);
        }
    }

    @Override
    public void update(Publisher publisher) {
        this.runs = publisher.getRuns();
        this.overs = publisher.getOvers();
        // logic to persist detail in DB
        // algorithm to compute projected score
        // logic to update the board display
        System.out.println("RunRateSubscriber: Runs: " + runs + ", Overs: " + overs);
    }
}