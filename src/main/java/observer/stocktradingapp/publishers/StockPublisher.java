package observer.stocktradingapp.publishers;

import observer.stocktradingapp.StockName;
import observer.stocktradingapp.StockValue;
import observer.stocktradingapp.subscribers.StockSubscriber;

public interface StockPublisher {
    void subscribe(StockSubscriber subscriber);
    void unsubscribe(StockSubscriber subscriber);
    void notifyAll(StockName stockName, StockValue stockPrice);
}
