package itish.Polymorphism.MethodOverriding;

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.color(2,3); // color is blue
        Parent child1 = new Child();
        child1.color(4,5); // color is blue
    }
}
