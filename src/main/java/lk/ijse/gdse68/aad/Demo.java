package lk.ijse.gdse68.aad;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext(); //create boll  can work to spring
        // boll -05 =>>
        ctx.register(MyConfig.class); // input the boll MyConfig object
        ctx.refresh(); // context refresh showing input object
        ctx.close();  // end of work close object
        //application context boll ek athulat waten component object tiyenwanm ewagen tamayi mek wenne
    }
}
