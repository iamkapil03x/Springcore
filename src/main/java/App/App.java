package App;

import Entity.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext factory = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Employee e = factory.getBean(Employee.class,"Bean wale");
        System.out.println(e);
    }
}
