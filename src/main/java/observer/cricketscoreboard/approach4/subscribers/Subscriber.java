package observer.cricketscoreboard.approach4.subscribers;

public interface Subscriber {
    void update(int runs, float overs, int wickets);
}
