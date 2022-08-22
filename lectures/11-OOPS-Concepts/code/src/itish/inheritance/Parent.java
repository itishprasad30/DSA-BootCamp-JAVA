package itish.inheritance;

public class Parent {
    int a = 44;
    int b = 32;
    Parent(int a,int b,int c){
        System.out.println("Hello");
    }
    Parent(){}
    Parent(int a,int b){
        this.a= a;
        this.b = b;
        System.out.println("Parent class");
    }

}
