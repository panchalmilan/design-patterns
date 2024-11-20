package observer.cricketscoreboard.approach7.publishers;


import observer.cricketscoreboard.approach7.subscribers.Subscriber;

public interface Publisher {
    void subscribe(Subscriber subscriber);
    void unsubscribe(Subscriber subscriber);
    void notifyAll(int runs, float overs, int wickets);
    int getRuns();
    float getOvers();
    int getWickets();
    PublishersEnum getName();
}
