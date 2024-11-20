package observer.cricketscoreboard.approach6.subscribers;

import lombok.Getter;
import observer.cricketscoreboard.approach6.publishers.Publisher;
import observer.cricketscoreboard.approach6.publishers.PublishersEnum;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class ProjectedScoreSubscriber implements Subscriber {
    @Getter
    private int runs;

    @Getter
    private float overs;

    @Getter
    private int wickets;

    @Getter
    private final Map<PublishersEnum, Publisher> publishers;

    public ProjectedScoreSubscriber(List<Publisher> publishers) {
//        System.out.println("\t\trunning ProjectedScoreSubscriber's constructor...");
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
        System.out.println("ProjectedScoreSubscriber: Runs: " + runs + ", Overs: " + overs + ", wickets: " + wickets);
    }
}