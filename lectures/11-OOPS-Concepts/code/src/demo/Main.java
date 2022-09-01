package demo;

public class Main {
    public static void main(String[] args) {
        Parent p = new Parent() {
            @Override
            void fun() {
                System.out.println("hello World");
            }
        };
        p.fun();
    }
}
