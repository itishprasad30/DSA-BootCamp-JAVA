package PraticeProgram.ObjectClass;

import java.util.Objects;

public class Student {

   String name;
   int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,id);
    }

//    @Override
//    public boolean equals(Object obj) {
//        return super.equals(obj);
//    }



}
