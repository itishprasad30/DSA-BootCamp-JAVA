package AfterLife;
class Demo{
    int a;
    int b;
    public Demo(){
        a=10;
        b=20;
    }

}
class Demo4 extends Demo{
    int c;
    int d;
    public Demo4(int e,int f){
        c=e;
        d=f;
    }
    public void display(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}

public class Demo2 {
    public static void main(String[] args) {
        Demo4 d = new Demo4(2,5);
        d.display();
    }
}
