package client;

import bean.Developer;
import bean.Manager;
import bean.Project;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientCode {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Developer dev = context.getBean("developerA", Developer.class);
        System.out.println(dev);
        System.out.println("");

        Manager manager = context.getBean("manager", Manager.class);
        System.out.println(manager);
        System.out.println("");

        Project project = context.getBean("wk", Project.class);
        System.out.println(project);
        System.out.println("");

        ((AbstractApplicationContext) context).close();

    }
}
