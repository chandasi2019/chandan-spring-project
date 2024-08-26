package com.chandan;


import org.springframework.stereotype.Component;

@Component
public class Boat implements Vehicle{
    @Override
    public void drive() {
        System.out.println("Boat is sailing");
    }
}
