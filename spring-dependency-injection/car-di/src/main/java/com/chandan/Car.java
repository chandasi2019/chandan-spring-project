package com.chandan;

import org.springframework.beans.factory.annotation.Autowired;

public class Car implements Vehicle {
    @Autowired
    private Engine engine;
    public void drive(){
        System.out.println("Car is running");
        System.out.println("Engine: "+engine);
    }
}
