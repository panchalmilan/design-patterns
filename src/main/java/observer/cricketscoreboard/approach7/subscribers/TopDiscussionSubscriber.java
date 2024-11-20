package observer.cricketscoreboard.approach7.subscribers;

import lombok.Getter;
import observer.cricketscoreboard.approach7.publishers.Publisher;
import observer.cricketscoreboard.approach7.publishers.PublishersEnum;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class TopDiscussionSubscriber implements Subscriber {
    @Getter
    private int runs;

    @Getter
    private float overs;

    @Getter
    private int wickets;

    @Getter
    private Map<PublishersEnum, Publisher> publishers;

    public TopDiscussionSubscriber(List<Publisher> publishers) {
//        System.out.println("\t\trunning TopDiscussionSubscriber's constructor...");
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
        this.wickets = publisher.getWickets();
        // logic to persist detail in DB
        // algorithm to compute projected score
        // logic to update the board display
        System.out.println("TopDiscussionSubscriber: Runs: " + runs + ", Overs: " + overs + ", wickets: " + wickets);
    }
}