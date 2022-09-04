package itish.InnerClass;

import java.util.Comparator;

public class MainRunner3 {
    // Non static inner Class

    class MyComparator implements Comparator {
        // inside non static inner class or nested class
        // only non static members can access
       public int compare(Object o1,Object o2){
           return o1.hashCode() - o2.hashCode();
       }
    }
    public static void main(String[] args) {
        Comparator com = new MainRunner3().new MyComparator();
        System.out.println(com.compare("Apple","orange"));//1072327948

    }
}
