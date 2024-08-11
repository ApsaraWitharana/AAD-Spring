package lk.ijse.gdse68.aad.config;

import lk.ijse.gdse68.aad.beans.Customer;
import lk.ijse.gdse68.aad.beans.Order;
import lk.ijse.gdse68.aad.beans.TextBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration // adal class ek configuration class ekk krnwa //config krgnn
//@ComponentScan(basePackages = "lk.ijse.gdse68.aad")  //Packages ekyi eke sub Packages ekeyi witryi krnne=basePackages // adal class ek hoyal denn agent krnne metnin boll eke register krnne
@ComponentScan(basePackageClasses = {TextBean.class})//spring eligible widiyt hadal tiyenm ek class ek serch krl parameter widiyt pass kral serch krgnnw class ek/basepackage,base //nam krapu class ekyi eke package ekkyi serch kragnnwa
public class Config {
    //can working spring
    @Bean
    public Order order(){
        return new Order(); // new key word use wenne methn withrayi // new object hadnn hinda new use krnn epa spring wisinm ob hadan hinda
        // bean vs component => ym kisi ob ekk spring wisin manage krnn sudusuyi kiyl == bean ** source code nati class ekk bean ekk widiyt dagnn one nam ek bean annotation use krnwa
        // bean vs component - component-source code ekk tiyen class ekk calss level eke tiyen component ekk // bean source code ekk nati ekk bean ekk widiyt bean anotation ek danwa
        //bean -spring manage krn object /this is  singleton scope
    }


}

