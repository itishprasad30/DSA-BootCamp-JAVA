package itish.inheritance;

public class Child extends Parent {
    int c;
    int d = super.a;
    Child(int a, int b, int c) {
        super(a, b, c);
        this.c = c;
        System.out.println("Child class");
    }
    Child (int c){
        super();
        this.c= c;

    }
    Child (){

    };

    public static void main(String[] args) {
        String name = null;
        System.out.println(name.toString()); // NUll pointer excepiton

        Child ch = new Child(1, 2, 3);
        Child ch1 = new Child(3);
        Child ch2 = new Child();
        System.out.println(ch2.d);
        System.out.println(ch2.a);
        System.out.println(ch2.b);
        System.out.println(ch2.c);
    }
}