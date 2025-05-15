package com.krishna.myApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Laptop implements Computer {
    public void compile(){
        System.out.println("Laptop : arrey bhai compile ho gaya");
    }
}
