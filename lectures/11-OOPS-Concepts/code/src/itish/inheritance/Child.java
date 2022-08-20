package itish.inheritance;

public class Child extends Parent {
    int c;

    Child(int a, int b, int c) {
        super(a, b, c);
        this.c = c;
        System.out.println("Child class");
    }
    Child (int c){
        super();
        this.c= c;

    }




    public static void main(String[] args) {
        Child ch = new Child(1, 2, 3);
        Child ch1 = new Child(3);
        System.out.println(ch.toString());

    }
}
