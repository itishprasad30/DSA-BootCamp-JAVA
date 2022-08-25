package itish.Interfaces.ExtendsDemo2;

public interface A {
    // static interface always have body
    // Call by the Interface name

    static void display(){
        System.out.println("Hey i am in static interface");
    }

    // void fun();// abstract method
    // after java 1.8
    default void fun(){
        System.out.println("I am in A");
    }

}
