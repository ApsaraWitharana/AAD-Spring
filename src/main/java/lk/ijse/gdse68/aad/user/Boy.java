package lk.ijse.gdse68.aad.user;

import jakarta.annotation.PostConstruct;
import lk.ijse.gdse68.aad.dep.GoodGirl;
import lk.ijse.gdse68.aad.dep.Wow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class Boy {
    @Autowired //good girl type eke ekk inject krnwa
    @Qualifier("Swit smile") //ek saman bean dekk tiyenm eken ekk inject krnn use krnwa
    @Wow
    private GoodGirl goodGirl;
//    public Till() {
//        System.out.println(goodGirl);
//    }

    @PostConstruct
    public void init(){
        //System.out.println(goodGirl);
        goodGirl.love(); // interface eke tiyen abstract method ek invoke wenne
    }
}
