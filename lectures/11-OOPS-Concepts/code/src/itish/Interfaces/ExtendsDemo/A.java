package itish.Interfaces.ExtendsDemo;

public interface A {

    void fun();
    default void display() {
         System.out.println("In the interface");
    }
}
