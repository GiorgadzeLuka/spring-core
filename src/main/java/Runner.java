import bean.UserManagerBean;
import model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        UserManagerBean userManager = context.getBean("userManager", UserManagerBean.class);
        User userA = context.getBean("userA", User.class);
        User userB = context.getBean("userB", User.class);
        userManager.registerUsers(userA, userB);
        userManager.printRegisteredUsers();

        ((AbstractApplicationContext) context).close();
    }

}
