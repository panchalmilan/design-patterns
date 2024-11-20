package observer.stocktradingapp;

import lombok.Getter;

public class StockValue {
    @Getter private final int version;
    @Getter private final double price;
    @Getter private final Currency currency;

    public StockValue(int version, double price, Currency currency) {
        this.version = version;
        this.price = price;
        this.currency = currency;
    }
}
