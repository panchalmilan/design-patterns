package observer.cricketscoreboard.approach6.subscribers;

import observer.cricketscoreboard.approach6.publishers.Publisher;

public interface Subscriber {
    void update(Publisher publisher);
}
