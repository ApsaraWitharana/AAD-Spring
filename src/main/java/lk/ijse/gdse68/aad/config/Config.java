package lk.ijse.gdse68.aad.config;

import lk.ijse.gdse68.aad.aop.Logs;
import lk.ijse.gdse68.aad.aop.Transaction;
import lk.ijse.gdse68.aad.beans.Customer;
import lk.ijse.gdse68.aad.beans.Order;
import lk.ijse.gdse68.aad.beans.TextBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration // adal class ek configuration class ekk krnwa //config krgnn //source for bean definition
//@ComponentScan(basePackages = "lk.ijse.gdse68.aad")  //Packages ekyi eke sub Packages ekeyi witryi krnne=basePackages // adal class ek hoyal denn agent krnne metnin boll eke register krnne
@ComponentScan(basePackageClasses = {Transaction.class, Logs.class})//spring eligible widiyt hadal tiyenm ek class ek serch krl parameter widiyt pass kral serch krgnnw class ek/basepackage,base //nam krapu class ekyi eke package ekkyi serch kragnnwa
public class Config {
    //can working spring
  //  @Bean
   // public Order order(){
   //     return new Order(); // new key word use wenne methn withrayi // new object hadnn hinda new use krnn epa spring wisinm ob hadan hinda
        // bean vs component => ym kisi ob ekk spring wisin manage krnn sudusuyi kiyl == bean ** source code nati class ekk bean ekk widiyt dagnn one nam ek bean annotation use krnwa
        // bean vs component - component-source code ekk tiyen class ekk calss level eke tiyen component ekk // bean source code ekk nati ekk bean ekk widiyt bean anotation ek danwa
        //bean -spring manage krn object /this is  singleton scope
   // }


}


//scope annotation -bean ekk scope ek change kragnn//scope4 but this using 2 annotation scope 1.singleton,2.prototype
//3. session
//4. requestusig web applicaton

//Aspect-oriented programming-LOGIN/LOG/SIGNUP
//SIGNUO CLASS EKE -log ekk dan ekdanne ek t adal ewa witharyi//pradana kryat amathraw tiyen wenat  karayk ayin kran ek
//AOP includes programming methods and tools that support the modularization of concerns at the level
// of the source code, while aspect-oriented software development refers to a whole engineering discipline.
//Aspect-oriented programming entails breaking down program logic into cohesive areas of functionality
// (so-called concerns). Nearly all programming paradigms support some level of grouping and encapsulation of
// concerns into separate, independent entities by providing abstractions (e.g., functions, procedures, modules,
// classes, methods) that can be used for implementing, abstracting, and composing these concerns. Some concerns
// "cut across" multiple abstractions in a program, and
// defy these forms of implementation. These concerns are called cross-cutting concerns or horizontal concerns.

//**In aspect-oriented software development, cross-cutting concerns are aspects of a program that affect several
// modules, without the possibility of being encapsulated in any of them. These concerns often cannot be cleanly
// decomposed from the rest of the system in both the design and implementation, and can
// result in either scattering (code duplication), tangling (significant dependencies between systems), or both.