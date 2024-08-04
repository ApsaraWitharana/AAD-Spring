package lk.ijse.gdse68.aad.user;

import jakarta.annotation.PostConstruct;
import lk.ijse.gdse68.aad.dep.GoodGirl;
import lk.ijse.gdse68.aad.dep.Wow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component

public class Boy {
     //good girl type eke ekk inject krnwa //
    @Qualifier("Swit smile") //ek saman bean dekk tiyenm eken ekk inject krnn use krnwa

//field injection = null ekk enne nattm use krnn puluwan
    // bean ekkt wada wadiy tiyenm ekyi ekk use krnn puluwan
    //1, @primary annotation using priority
    //2. @Qualifier = string ekk widiyat collification ekk dal ek tiyen ekkenwa gnn puluwan
    //3. @Wow -@Retention(RetentionPolicy.RUNTIME) // annotation ek koyi welawed ayin wenn one kiyl //
    //bean eke constructor eken passe tamyi ek ganne

    //=========constructor injection=========== initialize kral
  //  private final GoodGirl goodGirl;
   // @Wow
    //@Autowired
    //public Boy( GoodGirl goodGirl) {
    //    this.goodGirl=goodGirl;

   // }

    //=========setter  injection=========value ek set kral
    // inject krnne interface type ekk tiyenm ekt  inject ek awashya kenat inject wenawa
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

  //  @Autowired(required = false) // sout prite wenne
    //Autowired use kral method ekk coll kragnn puluwan parameterize method but note using this //**
    @Autowired
    public void myMethod(@Nullable System name){
        System.out.println(name);
    }
}

//DI - counteracted