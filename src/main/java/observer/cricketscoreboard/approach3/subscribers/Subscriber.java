package observer.cricketscoreboard.approach3.subscribers;

public interface Subscriber {
    void update(int runs, float overs, int wickets);
}
