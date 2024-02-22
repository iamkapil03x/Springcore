package App;

import Entity.Parent;
import Entity.Parentlookup;
import config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App_1 {
    public static void main(String[] args) {
        ApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);
        // Use Parent Method
//        Parent parent = app.getBean(Parent.class);
//        System.out.println(parent);
//        System.out.println(parent.getChild());
//        System.out.println(parent.getChild());

        System.out.println("-----LookUp_01-----");
        Parentlookup beanPL = app.getBean(Parentlookup.class);
        System.out.println(beanPL);
        System.out.println("abstract method :"+beanPL.getChildDetails());
        System.out.println("abstract method :"+beanPL.getChildDetails());
        System.out.println("----LookUp_02");

        beanPL = app.getBean(Parentlookup.class);
        System.out.println(beanPL);
        System.out.println(beanPL.getChildDetails());
        System.out.println(beanPL.getChildDetails());
    }
}
