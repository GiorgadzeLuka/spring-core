import bean.TradingSystemAppConfig;
import bean.TradingSystemUsageEmulator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(TradingSystemAppConfig.class);

        TradingSystemUsageEmulator emulator = context.getBean(TradingSystemUsageEmulator.class);
        emulator.emulate(context);

    }

}
