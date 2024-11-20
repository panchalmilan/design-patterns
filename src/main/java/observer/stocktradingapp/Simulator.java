package observer.stocktradingapp;

import observer.stocktradingapp.publishers.StockPublisher;
import observer.stocktradingapp.publishers.StockUpdatePublisher;
import observer.stocktradingapp.subscribers.StockSubscriber;
import observer.stocktradingapp.subscribers.StockUpdatesSubscriber;

public class Simulator {
    public static void main(String[] args) {
        // PUBLISHER
        StockPublisher BSEPublisher = new StockUpdatePublisher("BSE");
        StockPublisher NSEPublisher = new StockUpdatePublisher("NSE");

        // SUBSCRIBER
        StockSubscriber zerodha = new StockUpdatesSubscriber(StockName.AMZ);
        StockSubscriber grow = new StockUpdatesSubscriber(StockName.TSLA);
        StockSubscriber sharekhan = new StockUpdatesSubscriber(StockName.AMZ);

        // SUBSCRIPTIONS
        /**
         *      PUBLISHER     <--->     SUBSCRIBER
         *      ---------               ----------
         *
         *      BSEPublisher  <--->     zerodha
         *                              grow
         *
         *      NSEPublisher  <--->     zerodha
         *                              grow
         *                              sharekhan
         */
        BSEPublisher.subscribe(zerodha);
        BSEPublisher.subscribe(grow);

        NSEPublisher.subscribe(zerodha);
        NSEPublisher.subscribe(grow);
        NSEPublisher.subscribe(sharekhan);


        // NOTIFICATIONS
        BSEPublisher.notifyAll(StockName.AMZ, new StockValue(1, 100, Currency.USD));
        /*
               UPDATE: AMZ stock: AMZ, stockPrice: 100.0, currency: USD, stockVersion: 1
               UPDATE: TSLA stock: AMZ, stockPrice: 100.0, currency: USD, stockVersion: 1
        */

        NSEPublisher.notifyAll(StockName.AMZ, new StockValue(2, 102, Currency.USD));
        /*
                UPDATE: AMZ stock: AMZ, stockPrice: 102.0, currency: USD, stockVersion: 2
                UPDATE: TSLA stock: AMZ, stockPrice: 102.0, currency: USD, stockVersion: 2
                UPDATE: AMZ stock: AMZ, stockPrice: 102.0, currency: USD, stockVersion: 2
        */
    }
}
