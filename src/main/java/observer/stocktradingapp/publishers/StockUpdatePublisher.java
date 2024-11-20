package observer.stocktradingapp.publishers;

import observer.stocktradingapp.StockName;
import observer.stocktradingapp.StockValue;
import observer.stocktradingapp.subscribers.StockSubscriber;

import java.util.ArrayList;
import java.util.List;

public class StockUpdatePublisher implements StockPublisher {
    private final String name;
    private final List<StockSubscriber> subscribers;

    public StockUpdatePublisher(String name) {
        this.name = name;
        this.subscribers = new ArrayList<>();
    }


    @Override
    public void subscribe(StockSubscriber subscriber) {
        this.subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(StockSubscriber subscriber) {
        this.subscribers.remove(subscriber);
    }

    @Override
    public void notifyAll(StockName stockName, StockValue stockPrice) {
        for (StockSubscriber subscriber: this.subscribers) {
            subscriber.update(stockName, stockPrice);
        }
    }
}
