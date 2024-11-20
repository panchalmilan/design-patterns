package observer.stocktradingapp.subscribers;

import observer.stocktradingapp.StockName;
import observer.stocktradingapp.StockValue;

public interface StockSubscriber {
    void update(StockName stockName, StockValue stockPrice);
}
