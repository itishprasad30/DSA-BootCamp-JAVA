package itish.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class EmpArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList employees = new ArrayList();

        while (true){
            System.out.println("Enter the id ,name,sal of Employee");
            int id = in.nextInt();
            String name = in.next();
            double sal = in.nextDouble();

            Employee emp = new Employee(id,name,sal);
            employees.add(emp);
            System.out.println("Do you have more Employee :");
            String res = in.next();
            if(res.equalsIgnoreCase("no"))
                break;

        }
        System.out.println("Employee Lists :");
        // Iterator
        Iterator itr = employees.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        // by for Each
        for (Object obj :employees) {
            System.out.println(obj);
        }

        Employee emp = getHighSal(employees);
        System.out.println("Highest Salary Employee is : ");
        System.out.println(emp);

        List l = get50kAboveSal(employees);
        System.out.println("List of Employees whos salary is MOre than Above 50k : ");
        for (Object ob :l) {
            System.out.println(ob);
        }



    }

    private static List get50kAboveSal(ArrayList employees) {
        List ls = new ArrayList();
        for (Object obj :employees) {
            Employee emp = (Employee) obj;
            if(emp.sal >= 50000){
                ls.add(emp);
            }
        }
        return ls;
    }

    static Employee getHighSal(ArrayList employees) {
         Employee high = (Employee) employees.get(0);
         for (int i = 0; i < employees.size(); i++) {
             Employee em =(Employee) employees.get(i);
             if(em.sal > high.sal){
                 high = em;
             }
         }
         return high;

    }
}
