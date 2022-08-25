package itish.Interfaces.ExtendsDemo;

public class Main implements B{


    public static void main(String[] args) {
        Main a = new Main();
        a.fun();  //   A interfaces

        a.greet();//   B interfaces

    }

    @Override
    public void fun() {
        System.out.println("A interfaces");
    }

    @Override
    public void greet() {
        System.out.println("B interfaces");
    }
}
