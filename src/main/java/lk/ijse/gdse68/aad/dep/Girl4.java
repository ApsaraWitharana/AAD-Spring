package lk.ijse.gdse68.aad.dep;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Swit smile") // one time using by only one class
@Wow
public class Girl4 implements GoodGirl{
    @Override
    public void love() {
        System.out.println("I LOVE YOU SO MUCH...!!+Girl4");
        System.out.println("I LOVE YOU SO MUCH...!!+Girl4");
        System.out.println("I LOVE YOU SO MUCH...!! +Girl4");
        System.out.println("I LOVE YOU SO MUCH...!! +Girl4");
    }
}
