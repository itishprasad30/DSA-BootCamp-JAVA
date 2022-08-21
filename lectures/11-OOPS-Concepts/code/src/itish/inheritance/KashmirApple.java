package itish.inheritance;

public class KashmirApple extends Apple{
    String color ;
    KashmirApple(String name , int price,double radius,String color){
        super(name,price,radius);
        this.color = color;
    }
}
