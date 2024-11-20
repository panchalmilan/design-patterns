package observer.cricketscoreboard.approach6;

import observer.cricketscoreboard.approach6.publishers.ESPNCricketScorePublisher;
import observer.cricketscoreboard.approach6.publishers.PublishersEnum;
import observer.cricketscoreboard.approach6.publishers.SonyCricketScorePublisher;
import observer.cricketscoreboard.approach6.publishers.Publisher;
import observer.cricketscoreboard.approach6.subscribers.ProjectedScoreSubscriber;
import observer.cricketscoreboard.approach6.subscribers.RunRateSubscriber;
import observer.cricketscoreboard.approach6.subscribers.Subscriber;
import observer.cricketscoreboard.approach6.subscribers.TopDiscussionSubscriber;

import java.util.List;
import java.util.Optional;

public class PubSubTester {
    public static void main(String[] args) {
        // PUBLISHER
        Publisher sonyCricketScorePublisher = new SonyCricketScorePublisher();
        Publisher epsnCricketScorePublisher = new ESPNCricketScorePublisher();

        // SUBSCRIBER
        RunRateSubscriber runRateSubscriber = new RunRateSubscriber(List.of(epsnCricketScorePublisher));
        ProjectedScoreSubscriber projectedScoreSubscriber = new ProjectedScoreSubscriber(List.of(epsnCricketScorePublisher));
        TopDiscussionSubscriber topDiscussionSubscriber = new TopDiscussionSubscriber(List.of(sonyCricketScorePublisher));

        /*
        * SUBSCRIBER   <-->    PUBLISHER
        * ----------           ---------
        * ESPN         <-->    RunRate
        *              <-->    ProjectedScore
        * SONY         <-->    TopDiscussion
        *
        * */

        sonyCricketScorePublisher.notifyAll(10, 1.0f, 0);
        sonyCricketScorePublisher.notifyAll(13, 1.3f, 1);
        epsnCricketScorePublisher.notifyAll(13, 1.3f, 1);

        // projectedScoreSubscriber SUBSCRIBER itself unsubscribes from Sony PUBLISHER
        Optional.ofNullable(projectedScoreSubscriber.getPublishers().get(PublishersEnum.SONY)).ifPresent(v -> v.unsubscribe(projectedScoreSubscriber));
        // Since it is not subscribing to SONY, above statement will do nothing!

        sonyCricketScorePublisher.notifyAll(20, 2.0f, 1);
        epsnCricketScorePublisher.notifyAll(20, 2.0f, 1);

//        sonyCricketScorePublisher.unsubscribe(topDiscussionSubscriber);
        // or
        Optional.ofNullable(topDiscussionSubscriber.getPublishers().get(PublishersEnum.SONY)).ifPresent(v -> v.unsubscribe(topDiscussionSubscriber));
        /*
         * SUBSCRIBER   <-->    PUBLISHER
         * ----------           ---------
         * ESPN         <-->    RunRate
         *              <-->    ProjectedScore
         * */

        sonyCricketScorePublisher.notifyAll(20, 2.0f, 1);

        epsnCricketScorePublisher.subscribe(topDiscussionSubscriber);
        /*
         * SUBSCRIBER   <-->    PUBLISHER
         * ----------           ---------
         * ESPN         <-->    RunRate
         *              <-->    ProjectedScore
         *              <-->    TopDiscussion
         *
         * */

        epsnCricketScorePublisher.notifyAll(20, 2.0f, 1);
    }
}
