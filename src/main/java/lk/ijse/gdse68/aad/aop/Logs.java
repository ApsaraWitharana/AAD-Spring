package lk.ijse.gdse68.aad.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
//main task eke aspect ek
@Component
@Aspect // log is aspect aspect ekk widiyt wada krnn gnnwa
@EnableAspectJAutoProxy // Aspect kiyl annotation dapu class manage krnn sport krnnn kiyl //pull support krgnn wade hriytm wenn meken
//@Before - start method coll wenn klin transation ekk coll wenwa kiyl mek run wel log ekk wadinawa //end transction ek end wenn klin end log ek coll wenwa
public class Logs {
    //translation ekk coll krat passe tamyi strat wenne ekt samanw log ekk wadinaw ekt pararl mek coll wenwa
    @Before("execution(public void startTransaction())") //mona method ek coll wenn klin d mek coll krnn one kiyl
    public void logsForStartTransaction(){
        System.out.println("Logs for Transaction started");
    }
    @Before("execution( public void endTransaction())")
    public void logsForEndTransaction(){
        System.out.println("Logs for Transaction end");
    }
}

//core,web,data
//core ek tmyi use kre where minimum ek awam sudusu kam
//decorative-->>>>> stap by step step not explaining (sql,AOP) ->>IOC // boll eke tiyen object manage krala apit one wade kragnn puluwan
//imperative ->>>> stap by step step explaining (ex-java)
//decorative vs imperative

//AppInitializer - Include the main method and create context
//AppConfig - Config class
//  - Source for bean definition
//  - Agent to collect components with scan the component/s
//  - Annotations of ComponentScan and Configuration and their
//    duties
//  - base package and base-package class params in ComponentScan
//Component classes - Annotated with Component annotation
//(Given control to Spring is after annotated as Component)

//Agent - set the  object to boll (beans -spring manage object)
//@Component - this component using select the object class package is the can manage spring
//@Component ("class name set naming configuration")
//@ComponentScan - this annotation using select the agent//pull support krgnn wade hriytm wenn meken
//@Configuration- working to configuration object
//@Bean- nothing to source code
//colling bean life circle
//pojo-is the java object as note java object is not to pojo
// A POJO (Plain Old Java Object) is a simple Java object that doesn't have any special restrictions
// or requirements, like adhering to specific Java frameworks or libraries.
//Dependency inject - same ewa ekkt wada tiyenwa nm ek manage krnne kohomd kiyl(bean ambiguity)
//Usage of @Primary,@Qualifier and create custom annotation  with use of
//retention policy

//Bean is singleton -scope -prototype lif circle note go to eny factory  //managing ready to stage ->go back
//AOP - application eke tiyen task eken direct nati ewa accept krn ek ayin krn ek..set library =>>transaction ekk wadin kot ek log wadinna hadanwa => end and start
//aduma key word ek NEW - casting waladi witryi use wenne new object ekk hadagnn
//section,request,singleton
//Get the Aspect J and usage to manage Aspects
//Usage of @Aspect, @EnableAspectJAutoProxy,@Before and @After annotations