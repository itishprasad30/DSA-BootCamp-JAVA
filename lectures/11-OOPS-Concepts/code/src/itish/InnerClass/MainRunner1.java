package itish.InnerClass;

public class MainRunner1 {
    public static void main(String[] args) {
        Comparable com = new MyComparerable();
        System.out.println(com.compareTo("Itish")); //1409032877

        // accessing the inner static class -> className followed by static class name
        Comparable com1 = new MainRunner2.MyCompareable();
        System.out.println(com1.compareTo("pintu")); //1722300512

    }
}
