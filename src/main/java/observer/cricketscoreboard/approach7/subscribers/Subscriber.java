package observer.cricketscoreboard.approach7.subscribers;

import observer.cricketscoreboard.approach7.publishers.Publisher;

public interface Subscriber {
    void update(Publisher publisher);
}
