package lk.ijse.gdse68.aad;

import lk.ijse.gdse68.aad.config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInit {
    public static void main(String[] args) {
        var ctx   = new AnnotationConfigApplicationContext();//IC-inversion of controller spring manage the program// create boll
//        ctx=nameing conversion
        ctx.register(Config.class); //derect class dnne object danne wada krn ewa tik // e class hoyagnn use krnne register(); =>> config class ->>source for bean definition //2 work 1.  register(); 2, application class ekt ynn kamati class config krnwa
        ctx.refresh(); // aluthen register una ewa blgnn
        ctx.close(); //closing
    }
}
