package PraticeProgram.ArrayList;

public class Employee implements Comparable {
    int id;
    String name;
    double sal;

    public Employee(int id, String name, double sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    @Override
    public String toString() {
        return id+ "---" + this.name +"---"+this.sal;
    }

    @Override
    public int compareTo(Object o) {
        Employee e = (Employee)o;

        String  i = e.name;
        String j = this.name;
        return -i.compareTo(j);
    }
}
