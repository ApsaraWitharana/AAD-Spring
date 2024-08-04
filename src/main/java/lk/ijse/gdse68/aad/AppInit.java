package lk.ijse.gdse68.aad;

import lk.ijse.gdse68.aad.config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


//Spring Core - Process of IOC and related matters
public class AppInit {
    public static void main(String[] args) {
        var ctx   = new AnnotationConfigApplicationContext();//IC-inversion of controller spring manage the program// create boll
//        ctx=nameing conversion
        ctx.register(Config.class); //derect class dnne object danne wada krn ewa tik // e class hoyagnn use krnne register(); =>> config class ->>source for bean definition //2 work 1.  register(); 2, application class ekt ynn kamati class config krnwa
        ctx.refresh(); // aluthen register una ewa blgnn
        ctx.close(); //closing

//source for bean definition ==>> kohomd beans hadagnne kiyla
        // main component 3- web /core/ data
        // awam ek core ek
        // full mode - features wadi ganak dagnn full mode configuration class ekk atule krn cofig
        // light mode -

    }
}
