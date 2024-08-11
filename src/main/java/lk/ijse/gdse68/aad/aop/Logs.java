package lk.ijse.gdse68.aad.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
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
