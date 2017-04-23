package bean;

import model.User;
import org.springframework.context.ApplicationContext;

public class MovieTheaterSystemEmulator {

    public void emulate(ApplicationContext context) {
        UserManagerBean userManager = context.getBean("userManager", UserManagerBean.class);
        User userA = context.getBean("userA", User.class);
        User userB = context.getBean("userB", User.class);
        userManager.registerUsers(userA, userB);
        userManager.printRegisteredUsers();
    }
}
