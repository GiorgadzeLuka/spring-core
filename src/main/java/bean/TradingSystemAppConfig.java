package bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:config.properties")
public class TradingSystemAppConfig {

    @Bean
    public TradingSystem tradingSystem() {
        return new TradingSystem();
    }

    @Bean
    public StockGenerator stockGenerator() {
        return new StockGenerator(propertyHolder().stocksAmount());
    }

    @Bean
    public StockAmountPropertyHolder propertyHolder() {
        return new StockAmountPropertyHolder();
    }

    @Bean
    public TradingSystemUsageEmulator emulator() {
        return new TradingSystemUsageEmulator();
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
