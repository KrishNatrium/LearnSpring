package com.krishna.myApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {
    public void compile(){
        System.out.println("Computer : arrey bhai compile ho gaya");
    }
}
