package observer.cricketscoreboard.approach5;

import observer.cricketscoreboard.approach5.publishers.CricketScorePublisher;
import observer.cricketscoreboard.approach5.publishers.Publisher;
import observer.cricketscoreboard.approach5.subscribers.ProjectedScoreSubscriber;
import observer.cricketscoreboard.approach5.subscribers.RunRateSubscriber;
import observer.cricketscoreboard.approach5.subscribers.Subscriber;
import observer.cricketscoreboard.approach5.subscribers.TopDiscussionSubscriber;

import java.util.List;

public class PubSubTester {

    public static void connect(Publisher publisher, List<Subscriber> subscribers) {
        for(Subscriber subscriber: subscribers) {
            publisher.subscribe(subscriber);
        }
    }

    public static void main(String[] args) {
        // PUBLISHER
        CricketScorePublisher cricketScorePublisher = new CricketScorePublisher();

        // SUBSCRIBER
        RunRateSubscriber runRateSubscriber = new RunRateSubscriber(cricketScorePublisher);
        TopDiscussionSubscriber topDiscussionSubscriber = new TopDiscussionSubscriber(cricketScorePublisher);
        ProjectedScoreSubscriber projectedScoreSubscriber = new ProjectedScoreSubscriber(cricketScorePublisher);

        // connect publisher & subscriber
        connect(cricketScorePublisher, List.of(runRateSubscriber, topDiscussionSubscriber, projectedScoreSubscriber));

        cricketScorePublisher.notifyAll(10, 1.0f, 0);
        cricketScorePublisher.notifyAll(13, 1.3f, 1);

        projectedScoreSubscriber.getPublisher().unsubscribe(projectedScoreSubscriber);

        cricketScorePublisher.notifyAll(20, 2.0f, 1);
    }
}
