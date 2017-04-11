package bean;

import model.Stock;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class StockGenerator {
    private int stocksAmount;

    public StockGenerator(int stocksAmount) {
        this.stocksAmount = stocksAmount;
    }

    public List<Stock> generateStocks() {
        List<Stock> stocks = new ArrayList<>();
        for (int i = 0; i < stocksAmount; i++) {
            Stock stock = new Stock();
            stock.setPrice(Math.random() * 100);
            stock.setName(UUID.randomUUID().toString());
            stocks.add(stock);
        }
        return stocks;
    }
}
