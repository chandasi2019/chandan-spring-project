package resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.entity.Employee;

@Configuration
public class BeansConfigFile {
    @Bean("emp1")
    public Employee employeeChandan(){
        Employee emp = new Employee();
        emp.setName("Chandan Kumar Singh");
        emp.setEmail("Chandan@gmail.com");
        emp.setId(2345);
        return emp;
    }

    @Bean("emp2")
    public Employee employeeAmit(){
        Employee emp = new Employee();
        emp.setName("Amit Kumar Singh");
        emp.setEmail("amit@gmail.com");
        emp.setId(1234);
        return emp;
    }
}
