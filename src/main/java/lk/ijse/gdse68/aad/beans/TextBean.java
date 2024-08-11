package lk.ijse.gdse68.aad.beans;

import jakarta.annotation.PreDestroy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("test")
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)

public class TextBean implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

    @Override
    public void setBeanName(String name) { //
        //System.out.println("Bean name is "+name);
    }
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean Factory is "+ beanFactory);
    }


    @Override
    public void destroy() throws Exception {
        System.out.println("going");
    }

    @PreDestroy
    public void  customerDestroyTest(){
        System.out.println("man ynoo with customer destroy"); // lastly check krgnn mek spring Destroy ekk newe

        //PreDestroy vs Destroy = close weddi resource cline krgnn use we. //
        // reader/db connection close krgnn spring framework work eke hammen Destroy ek nanntm custom eke hamben PreDestroy
        //@PreDestroy = method in work krnn use we pojo ek newe // life circle method
    }
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("ITS 2024 -adad");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("applicationContext is "+ applicationContext);
    }
}
