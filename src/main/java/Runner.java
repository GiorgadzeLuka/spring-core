import bean.StockGenerator;
import bean.TradingSystem;
import bean.TradingSystemAppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(TradingSystemAppConfig.class);

        TradingSystem tradingSystem = context.getBean(TradingSystem.class);
        StockGenerator stockGenerator = context.getBean(StockGenerator.class);

        tradingSystem.addStocks(stockGenerator.generateStocks());
        System.out.println(tradingSystem.availableStockInPriceRange(0, 100));
    }

}
