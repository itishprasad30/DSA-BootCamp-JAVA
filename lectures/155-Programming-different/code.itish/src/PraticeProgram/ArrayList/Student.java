package PraticeProgram.ArrayList;

import java.util.*;

public class Student {
    int id;
    String name;
    double percentage;

    public  Student(int id, String name, double percentage) {
        this.id = id;
        this.name = name;
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.percentage;

    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Scanner sc = new Scanner(System.in);
        Random rs = new Random();


        ArrayList<Student> student = new ArrayList<Student>();


        Comparator com = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Student s1 = (Student) o1;
                Student s2 = (Student) o2;

                // String comparasion
                String d1 = s1.name;
                String d2 = s2.name;
                return -d1.compareTo(d2);
            }
        };

        while (true){
            System.out.println("Enter name,Percentage of Student");
            int id = rs.nextInt();
            String name = sc.next();
            double per = sc.nextDouble();

            Student stu = new Student(id,name,per);
            student.add(stu);
            System.out.println("Do you have more Student :");
            String res = in.next();
            if(res.equalsIgnoreCase("no"))
                break;

        }
        System.out.println("Student Lists :");
        student.sort(com);
        ListIterator<Student> it = student.listIterator();
        while (it.hasNext()){
            System.out.println(it.next());

        }




    }
}
