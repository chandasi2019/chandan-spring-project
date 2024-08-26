package com.java.main;

import com.java.entity.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //Start/Activate IOC container
        ApplicationContext context = new ClassPathXmlApplicationContext("resources/springConfig.xml");
        Employee employee= (Employee)context.getBean("employeeChadnan");
        //Another way to get bean
        //Employee employee= (Employee)context.getBean(Employee.class);
        // Above syntax will work if a class has only one bean object
        System.out.println("Name: "+employee.getName()+" Email: "+employee.getEmail()+" ID: "+employee.getId());

        Employee employeeAmit= (Employee)context.getBean("employeeAmit");
        System.out.println("Name: "+employeeAmit.getName()+" Email: "+employeeAmit.getEmail()+" ID: "+employeeAmit.getId());

    }
}
