package client;

import beans.Developer;
import beans.Project;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientCode {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Developer developer = (Developer) context.getBean("dev");
        System.out.println(developer);

        Developer intern = context.getBean("intern", Developer.class);
        intern.setLevel(1);
        intern.setSkill("Kotlin");
        System.out.println(intern);

        Developer dotNetDev = context.getBean("dotNetDev", Developer.class);
        System.out.println(dotNetDev);

        Developer anonymous = context.getBean("anonymous", Developer.class);
        System.out.println(anonymous);

        Project startup = context.getBean("startup", Project.class);
        System.out.println(startup);

        Project javaProject = context.getBean("java10", Project.class);
        System.out.println(javaProject);
    }
}
