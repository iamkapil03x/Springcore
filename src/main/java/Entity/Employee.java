package Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Employee {
   private int id = 101;
   private String name = "Guest";
   private int salary = 10_000;

   @Autowired
    private Address address;

   @PostConstruct
    public void turnOn(){
       System.out.println("Load Operating System Emp");
   }

   @PreDestroy
    public void turnOff(){
       System.out.println("Close All Programs Emp");
   }

   public Employee(){
       System.out.println("Employee.Employee()");
   }

   public Employee(Address address){
       this.address = address;
   }
   public int getId(){
       return id;
   }

    public void setId(int id) {
        System.out.println("Id are .....");
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Name is......");
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", address=" + address +
                '}';
    }
}

