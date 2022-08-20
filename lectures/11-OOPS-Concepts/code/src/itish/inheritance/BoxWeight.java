package itish.inheritance;

public class BoxWeight extends  Box{
    double weight;


    static void greetings(){
        System.out.println("Hey , i am in BoxWeight class grettings");
    }
    public BoxWeight(){
        this.weight = -1;
    }

    public BoxWeight(double l,double h,double w,double weight) {
        super(l,h,w);
        this.weight = weight;
    }
}
