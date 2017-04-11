package model;

import java.util.ArrayList;
import java.util.List;

public class Trader {
    private double purse;
    private List<Stock> purchasedStocks = new ArrayList<>();

    public double getPurse() {
        return purse;
    }

    public void setPurse(double purse) {
        this.purse = purse;
    }

    public List<Stock> getPurchasedStocks() {
        return purchasedStocks;
    }

    public void setPurchasedStocks(List<Stock> purchasedStocks) {
        this.purchasedStocks = purchasedStocks;
    }

    public void purchaseStock(Stock stock) {
        if (stock.getPrice() > purse) {
            throw new RuntimeException("You don't have enough money to purchase the stock: " + stock.getName());
        }

        purchasedStocks.add(stock);
        purse = -stock.getPrice();
    }
}
