package bean;

import model.Stock;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TradingSystem {
    private List<Stock> stocks = new ArrayList<>();

    public List<Stock> availableStockInPriceRange(double min, double max) {
        return stocks.stream()
                .filter(stock -> stock.getPrice() >= min && stock.getPrice() <= max)
                .collect(Collectors.toList());
    }

    public void addStocks(List<Stock> newStocks) {
        stocks.addAll(newStocks);
    }

}
