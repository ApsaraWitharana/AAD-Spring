package lk.ijse.gdse68.aad.dep;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Primary //ek saman bean dekk tiyenm eken ekk inject krnn use krnwa // using one time
@Qualifier("Swit smile") //qualification ekk dal ek tiyen kenawa gnnwa
public class Girl3 implements GoodGirl{
    @Override
    public void love() {
        System.out.println("I LOVE YOU SO MUCH...!! I MISS YOU!!+Girl3");
        System.out.println("I LOVE YOU SO MUCH...!! I MISS YOU!!+Girl3");
        System.out.println("I LOVE YOU SO MUCH...!! I MISS YOU!!+Girl3");
    }
}
