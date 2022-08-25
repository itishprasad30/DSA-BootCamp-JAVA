package itish.Polymorphism.MethodOverriding;

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.color(); // color is blue

//
//        Parent child1 = new Child();
//        child1.color(); // color is blue
        // because of overridden  1st in compliation
        // phase compiler decides that inside the child class you can't access the parent class
        // property but in the runtime what object is it child class so that child class method is called
    }
}
