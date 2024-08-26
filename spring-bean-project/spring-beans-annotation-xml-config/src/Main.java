import Entity.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("resources/AnnotationXmlConfig.xml");
        Employee emp = (Employee) context.getBean("employee");
        System.out.println("Name: "+emp.getName()+" Email: "+emp.getEmail()+" Id: "+emp.getId());

    }
}