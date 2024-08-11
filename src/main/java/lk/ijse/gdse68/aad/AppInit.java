package lk.ijse.gdse68.aad;

import lk.ijse.gdse68.aad.aop.Transaction;
import lk.ijse.gdse68.aad.beans.TextBean;
import lk.ijse.gdse68.aad.config.Config;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.w3c.dom.Text;


//Spring Core - Process of IOC and related matters
public class AppInit {
    public static void main(String[] args) {
        var ctx   = new AnnotationConfigApplicationContext();//IC-inversion of controller spring manage the program// create boll
//        ctx=nameing conversion
        ctx.register(Config.class); //derect class dnne object danne wada krn ewa tik // e class hoyagnn use krnne register(); =>> config class ->>source for bean definition //2 work 1.  register(); 2, application class ekt ynn kamati class config krnwa
        ctx.refresh(); // aluthen register una ewa blgnn
//        ctx.close(); //closing

        //AOP -transaction and logs //log aspect ekk prada ekt amathar ekk //aspect manage krnn use kranawa.
        Transaction transaction = (Transaction) ctx.getBean("Transaction");
//        Transaction transaction = (Transaction) ctx.getBeanFactory(); //casting
        transaction.startTransaction();
        transaction.endTransaction();
        //scope
        //q-01.interview what is spring bean life circle
       // ConfigurableBeanFactory beanFactory = ctx.getBeanFactory();// this is legacy //bean factory ekt wadiy application context wadi kral hadapu ekk tamyi application context
       // boolean isSingletonTest = beanFactory.isSingleton("test");
       //// System.out.println(test);
        //System.out.println("Is test singleton: "+isSingletonTest);
        ctx.registerShutdownHook();//gratefully shutdown
        //inter bean dependency ek mode ekk thaw mode ekk mt depend wen ek= full mode //light mode eke na


//source for bean definition ==>> kohomd beans hadagnne kiyla
        // main component 3- web /core/ data
        // awam ek core ek
        // full mode - features wadi ganak dagnn full mode configuration class ekk atule krn cofig
        // light mode -

//        DI =>>Dependency injection aims to separate the concerns of constructing objects and using them, leading to loosely coupled programs.[1][2][3] The pattern ensures that an object or function that wants to use a given service should not have to know how to construct those services. Instea
          //Dependency Injection
        //Dependency injection (DI) is a process whereby objects define their dependencies (that is, the other objects
        // with which they work) only through constructor arguments, arguments to a factory method, or properties that
        // are set on the object instance after it is constructed or returned from a factory method.
    }
}
