package itish.InnerClass;

import java.util.Comparator;

public class MainRunner2 {

    // static inner class
    static class MyCompareable implements  Comparable{
        // Compareable is a functional interface which has only one abstract method compareTo ()
        // inside static class both static and non static members can accessed

        @Override
        public int compareTo(Object obj) {
            return this.hashCode()-obj.hashCode();


        }


    }
    public static void main(String[] args) {
        Comparable com = new MyCompareable();
        System.out.println(com.compareTo("Rama")); //1477470685

        // accesing non-static inner class
        Comparator com1 = new MainRunner3().new MyComparator();
        System.out.println(com1.compare("Hi","Hi")); //0


    }
}
