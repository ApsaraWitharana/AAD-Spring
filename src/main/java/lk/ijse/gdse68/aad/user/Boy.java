package lk.ijse.gdse68.aad.user;

import jakarta.annotation.PostConstruct;
import lk.ijse.gdse68.aad.dep.GoodGirl;
import lk.ijse.gdse68.aad.dep.Wow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class Boy {
     //good girl type eke ekk inject krnwa //
    @Qualifier("Swit smile") //ek saman bean dekk tiyenm eken ekk inject krnn use krnwa


    //=========constructor injection===========
  //  private final GoodGirl goodGirl;
   // @Wow
    //@Autowired
    //public Boy( GoodGirl goodGirl) {
    //    this.goodGirl=goodGirl;

   // }

    //=========setter  injection=========
      private  GoodGirl goodGirl;
     @Wow
    @Autowired
    public void setGoodGirl(GoodGirl goodGirl){
        this.goodGirl=goodGirl;
    }

    @PostConstruct //JAVA EE dependency injection eke inject una
    public void init(){
        //System.out.println(goodGirl);
        goodGirl.love(); // interface eke tiyen abstract method ek invoke wenne
    }
}

//DI - counteracted