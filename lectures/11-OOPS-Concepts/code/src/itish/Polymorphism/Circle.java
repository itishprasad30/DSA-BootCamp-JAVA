package itish.Polymorphism;

public class Circle extends Shapes{

    // this will run when object of circle is created
    // hence it is overrideing the parent method
    @Override // This is called anotation use for check purpose
    void area(){
        System.out.println("Area of circle is pie * r * r");
    }

}
