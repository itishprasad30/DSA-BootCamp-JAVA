package itish.generics.comparing;

public class Student implements Comparable<Student>{
    String name ;
    float marks;

    public Student(String name, float marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o) {
        int diff = (int) (this.marks - o.marks);
        // if diff == 0  then means both are equal
        // if diff < 0  o is bigger else o is smaller.
        return diff;
    }
}
