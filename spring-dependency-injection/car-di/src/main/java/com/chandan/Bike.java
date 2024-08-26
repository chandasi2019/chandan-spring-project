package com.chandan;

import org.springframework.stereotype.Component;

//Annotation based beans
@Component
public class Bike implements Vehicle {
    public void drive(){
        System.out.println("Bike is running");
    }
}
