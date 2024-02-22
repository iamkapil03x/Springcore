package App;

import Entity.Address;
import Entity.Employee;
import Entity.EmployeeLazy;
import config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
//        ApplicationContext app = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        ApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);
        Employee bean = app.getBean(Employee.class);
        System.out.println(bean);
        System.out.println(bean.getAddress());

        System.out.println("---------------");

        Address addBean1 = app.getBean(Address.class);
        Address addBean2 = app.getBean(Address.class);
        System.out.println(addBean1);
        System.out.println(addBean2);

//        Employee bean1 = app.getBean(Employee.class);
        ((AbstractApplicationContext)app).registerShutdownHook();
    }
}
