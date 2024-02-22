package spring_core.Client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_core.Entity.Employee;
import spring_core.config.AppConfiguration;

public class App {
    public static void main(String[] args) {
        ApplicationContext app = new AnnotationConfigApplicationContext(AppConfiguration.class);
        Employee bean = app.getBean(Employee.class);
        System.out.println(bean);

    }
}
