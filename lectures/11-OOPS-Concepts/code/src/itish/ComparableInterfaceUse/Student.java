package itish.ComparableInterfaceUse;

import java.util.Objects;

public class Student  implements Comparable {
    String name;
    int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {

        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }
    // compare using int value
//    @Override
//    public int compareTo(Object o) {
//        Student s = (Student) o;
//        if(this.id == s.id)
//            return 0;
//        else if (this.id > s.id) {
//            return 1;
//        }else {
//            return -1;
//        }
//    }

    // compare using string value

    @Override
    public int compareTo(Object o) {
        Student s = (Student) o;
        return -this.name.compareTo(s.name);

    }
}
