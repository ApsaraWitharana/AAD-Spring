package lk.ijse.gdse68.aad.dep;

import org.springframework.stereotype.Component;

@Component
public class Girl1 implements GoodGirl {

    @Override
    public void love() {
        System.out.println("I LOVE YOU..!!+Girl1");
        //good girl type eke ekk inject krnwa
    }
}
