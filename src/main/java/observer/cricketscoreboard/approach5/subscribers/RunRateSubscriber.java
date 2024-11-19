package observer.cricketscoreboard.approach5.subscribers;

import lombok.Getter;
import observer.cricketscoreboard.approach5.publishers.Publisher;

public class RunRateSubscriber implements Subscriber {
    @Getter
    private int runs;

    @Getter
    private float overs;

    @Getter
    private final Publisher publisher;

    public RunRateSubscriber(Publisher publisher) {
        this.publisher = publisher;
    }

    @Override
    public void update() {
        this.runs = publisher.getRuns();
        this.overs = publisher.getOvers();
        // logic to persist detail in DB
        // algorithm to compute projected score
        // logic to update the board display
        System.out.println("RunRateSubscriber: Runs: " + runs + ", Overs: " + overs);
    }
}