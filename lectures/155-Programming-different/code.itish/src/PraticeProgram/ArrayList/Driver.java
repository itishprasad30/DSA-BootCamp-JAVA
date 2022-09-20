package PraticeProgram.ArrayList;

import java.util.TreeSet;

public class Driver {
    public static void main(String[] args) {
        Employee e1 = new Employee(1,"itish",22444);
        Employee e2 = new Employee(2,"ava max",14000);
        Employee e3 = new Employee(3,"taylor",87000.55);
        Employee e4 = new Employee(4,"charlie",98544.55);

        TreeSet<Employee> ts = new TreeSet<Employee>();

        ts.add(e1);
        ts.add(e2);
        ts.add(e3);
        ts.add(e4);

        for (Employee e:ts) {
            System.out.println(e);
        }
    }
}
