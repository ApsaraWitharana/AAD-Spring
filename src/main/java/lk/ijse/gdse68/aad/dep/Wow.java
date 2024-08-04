package lk.ijse.gdse68.aad.dep;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Qualifier
@Retention(RetentionPolicy.RUNTIME) // annotation ek koyi welawed ayin wenn one kiyl //
//These retention policies determine at which point an annotation is discarded.
//RetentionPolicy.SOURCE – visible by neither the compiler nor the runtime
//RetentionPolicy.CLASS – visible by the compiler
//RetentionPolicy.RUNTIME – visible by the compiler and the runtime
public @interface Wow {

}

//Annotation is use to gide