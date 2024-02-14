package Entity;

public class Employee {
    private Address address;
    private String name;
    private int id;

    public Employee(){
        super();
    }
    public Employee(Address address, String name, int id) {
        this.address = address;
        this.name = name;
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "address=" + address +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}

