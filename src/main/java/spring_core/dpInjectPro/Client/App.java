package spring_core.dpInjectPro.Client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_core.dpInjectPro.Entity.Employee;

public class App {
    public static void main(String[] args) {
//        ApplicationContext App = new ClassPathXmlApplicationContext("Application.xml");
        ApplicationContext App = new ClassPathXmlApplicationContext("spring_core/dpInjectPro/file/Application.xml");
        Employee bean = App.getBean("employee",Employee.class);
        System.out.println(bean);

        Employee bean1= App.getBean(Employee.class);
    }
}
