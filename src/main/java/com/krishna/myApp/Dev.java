package com.krishna.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    @Autowired // this is called a field injection
    @Qualifier("laptop")
    private Computer comp;

    // this is called contructor injection

/*    public Dev(Laptop laptop){
        this.laptop=laptop;
    }
*/
    //this is setter injection
/*
    @Autowired
    public void setLaptop(Laptop laptop){
        this.laptop = laptop;
    }
*/


    public void build(){
        comp.compile();
        System.out.println("Working on a project");
    }
}
