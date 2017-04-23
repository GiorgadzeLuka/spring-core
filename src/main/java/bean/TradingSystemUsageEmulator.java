package bean;

import org.springframework.context.ApplicationContext;

public class TradingSystemUsageEmulator {
    public void emulate(ApplicationContext context) {
        TradingSystem tradingSystem = context.getBean(TradingSystem.class);
        StockGenerator stockGenerator = context.getBean(StockGenerator.class);

        tradingSystem.addStocks(stockGenerator.generateStocks());
        System.out.println(tradingSystem.availableStockInPriceRange(0, 100));
    }
}
