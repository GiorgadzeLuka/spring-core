package bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:config.properties")
public class TradingSystemAppConfig {
    @Value("${stocks.amount:10}")
    private String stocksAmount;

    @Bean
    public TradingSystem tradingSystem() {
        return new TradingSystem();
    }

    @Bean
    public StockGenerator stockGenerator() {
        return new StockGenerator(propertyHolder().stocksAmount());
    }

    @Bean
    public PropertyHolder propertyHolder() {
        return new PropertyHolder();
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
