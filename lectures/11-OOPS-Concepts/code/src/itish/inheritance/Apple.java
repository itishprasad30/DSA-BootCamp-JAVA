package itish.inheritance;

public class Apple extends Fruit {
    double radius;
    Apple (String name , int price,double radius) {
        super(name,price);
        this.radius = radius;
    }


}
