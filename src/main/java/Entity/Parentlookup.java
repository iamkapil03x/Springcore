package Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
abstract public class Parentlookup {
    private String name;
    public Parentlookup(){
        System.out.println("Parent.ParentLookUp()");
    }
    @Lookup
    abstract public Child getChildDetails();
    @Autowired
    private Child child;
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }
}
