package bean;

import org.springframework.beans.factory.annotation.Value;

public class StockAmountPropertyHolder {
    @Value("${stocks.amount:10}")
    private String stocksAmount;

    public int stocksAmount() {
        return Integer.valueOf(stocksAmount);
    }
}
