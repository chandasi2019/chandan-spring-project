package spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import resources.BeansConfigFile;
import spring.entity.Employee;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeansConfigFile.class);
        //Employee emp = (Employee) context.getBean("employeeChandan");
        Employee emp = (Employee) context.getBean("emp1");
        System.out.println("Name: "+emp.getName()+" Email: "+emp.getEmail()+"Id: "+emp.getId());
        Employee emp1 = (Employee) context.getBean("emp2");
        System.out.println("Name: "+emp1.getName()+" Email: "+emp1.getEmail()+"Id: "+emp1.getId());
    }
}
