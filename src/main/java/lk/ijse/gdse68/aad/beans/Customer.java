package lk.ijse.gdse68.aad.beans;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("customer") //class level annotaion// e adal object ek eken haden object spring wisin manage krnn kiyl eligible krnwa wada krnn puluwan kiyl
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Customer {
    public Customer() {
//        System.out.println("hellow customer"); // eken object ekk create unam
    }
}

//Bean life circle =