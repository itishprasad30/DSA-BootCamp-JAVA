package demo;

public class Some {
    public static void main(String[] args) {
        A a = new A();
        A aa = new A();

        System.out.println(a.hashCode());
        System.out.println(aa.hashCode());

    }
}
