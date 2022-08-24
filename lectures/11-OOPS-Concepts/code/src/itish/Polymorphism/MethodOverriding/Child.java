package itish.Polymorphism.MethodOverriding;

public class Child extends Parent{
    @Override
    public void color(int a,int b){
        System.out.println("Color is blue" + a+b);
    }

}
