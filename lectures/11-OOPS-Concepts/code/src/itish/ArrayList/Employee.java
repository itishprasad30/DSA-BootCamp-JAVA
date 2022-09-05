package itish.ArrayList;

public class Employee {
    int eid;
    String name;
    double sal;

    public Employee(int eid,String name,double sal){
        this.eid = eid;
        this.name = name;
        this.sal = sal;
    }
    @Override
    public String toString(){
        return "[" + eid + "," + name + "," + sal + "]";
    }
}
