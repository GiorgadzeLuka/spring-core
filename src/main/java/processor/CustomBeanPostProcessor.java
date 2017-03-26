package processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class CustomBeanPostProcessor implements BeanPostProcessor {

    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
//        System.out.println("Bean " + s + " START");
        return o;
    }

    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
//        System.out.println("Bean " + s + " END");
        return o;
    }

}
