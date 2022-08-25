package itish.Interfaces.ExtendsDemo2;

public interface B {
    void greet();
    default void fun2(){
        System.out.println("I am in B");
    }

}
