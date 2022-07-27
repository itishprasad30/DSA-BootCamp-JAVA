package itish;

public class Main {
    public static void main(String[] args) {

        // store 5 roll no
        int[] rno = new int[5];
        // store 5 names
        String[] names = new String[5];

        // create a datatype to 5 student includes rno,name,marks
        float[] marks = new float[5];
        // this is where class comes to pictures

        // Class: class is a named group of properties & functions

        // combined into single entity via class

        //Convention class starts with captial latters

        // Class : class is template of object
        // Object : onject is an instance of class.
        // class helps us defineing datatype
        // follow tis class template to create a instace out of it . i:e object

        // class : logical construct
        // object : physical reality // occupies space in memory

        Student1[] students = new Student1[5];
        // identity of object / state of object
        // where value is stored

        // [a,b ] stack memory ref variable  ----- heap merory or object are stored actual value stored

        // using .[dot] operater we can access the data

        // instance variable -->>> variable inside the object

        // String name = "itish" // name-> ref variable


        Student itish = new Student();

        System.out.println(itish.rno);// 0
        System.out.println(itish.name);// null
        System.out.println(itish.marks);// 85.1
    }
}

class Student{
    int rno;
    String name;
    float marks = 85.1f;
}

class Student1 {
    int[] rno = new int[5];
    String[] names = new String[5];
    float[] marks = new float[5];

}
