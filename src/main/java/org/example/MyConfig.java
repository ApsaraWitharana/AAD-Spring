package org.example;

import org.springframework.stereotype.Component;

@Component // spring manage the MyConfig // work the object
public class MyConfig {
    MyConfig(){

        System.out.println("Hellow Myconfig");

    }
}