package itish.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();
        Shapes square1 = new Square();
        Trangle trangle = new Trangle();


        shape.area();// I am in Shapes
        circle.area();// Area is pie * r*r
        square.area(); // Area is Square of sides
        square1.area(); //Area is Square of sides
        trangle.area(); //Area is 0.5 * h * b
    }
}
