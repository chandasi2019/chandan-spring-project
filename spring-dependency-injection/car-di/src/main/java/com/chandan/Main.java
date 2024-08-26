package com.chandan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Car obj = new Car();
        //Bike obj = new Bike();
        //Vehicle vehicle = new Bike();//Making loose coupling in one side and tight coupling in another side
        //Vehicle vehicle = new Car();
        //vehicle.drive();
        //ApplicationContext context = new ClassPathXmlApplicationContext("C:\\host_dir\\my-github-project\\chandan-spring-project\\spring-dependency-injection\\dependency-injection-car\\src\\main\\resource\\springConfig.xml");
        ApplicationContext context = new ClassPathXmlApplicationContext("springConfig.xml");
        //XML based beans calling
        Vehicle vehicle = (Vehicle) context.getBean("vehicleCar");
        vehicle.drive();
        //Annotation based bean calling
        Vehicle boat = (Vehicle) context.getBean("bike"); //
        boat.drive();
        Tyre tyre = (Tyre)context.getBean("tyre") ;
        System.out.println("Tyre: "+tyre);
    }
}