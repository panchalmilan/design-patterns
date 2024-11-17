package observer.cricketscoreboard.approach4.publishers;


import observer.cricketscoreboard.approach4.subscribers.Subscriber;

public interface Publisher {
    void subscribe(Subscriber subscriber);
    void unsubscribe(Subscriber subscriber);
    void notifyAll(int runs, float overs, int wickets);
}
