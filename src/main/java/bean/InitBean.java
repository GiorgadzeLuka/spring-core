package bean;

import org.springframework.beans.factory.InitializingBean;

public class InitBean implements InitializingBean {

    public void afterPropertiesSet() throws Exception {
        System.out.println("Init bean was called.");
    }

}
