package lk.ijse.gdse68.aad.dep;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary //ek saman bean dekk tiyenm eken ekk inject krnn use krnwa
public class Girl2 implements GoodGirl{
    @Override
    public void love() {
        System.out.println("I LOVE YOU SO MUCH...!!+Girl2");
        System.out.println("I LOVE YOU SO MUCH...!!+Girl2");
    }
}
