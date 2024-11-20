package observer.stocktradingapp.subscribers;

import observer.stocktradingapp.StockName;
import observer.stocktradingapp.StockValue;
import observer.stocktradingapp.publishers.StockPublisher;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StockUpdatesSubscriber implements StockSubscriber {
    private final StockName name;
    private final Map<StockName, StockValue> stockValues;
    private final List<StockPublisher> publishers;

    public StockUpdatesSubscriber(StockName name) {
        this.name = name;
        this.stockValues = new HashMap<>();
        this.publishers = new ArrayList<>();
    }

    @Override
    public void update(StockName stockName, StockValue stockPrice) {
        System.out.println("UPDATE: " + this.name + " stock: " + stockName + ", stockPrice: " + stockPrice.getPrice() + ", currency: " + stockPrice.getCurrency() + ", stockVersion: " + stockPrice.getVersion());
        if(!stockValues.containsKey(stockName)) {
            stockValues.put(stockName, stockPrice);
        }
        else {
            if(stockValues.get(stockName).getVersion() < stockPrice.getVersion()) {
                stockValues.put(stockName, stockPrice);
            }
        }
    }
}
