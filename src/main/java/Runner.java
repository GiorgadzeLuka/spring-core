import bean.MovieTheaterSystemEmulator;
import bean.UserManagerBean;
import model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        MovieTheaterSystemEmulator emulator = context.getBean("emulator", MovieTheaterSystemEmulator.class);
        emulator.emulate(context);

        ((AbstractApplicationContext) context).close();
    }

}
