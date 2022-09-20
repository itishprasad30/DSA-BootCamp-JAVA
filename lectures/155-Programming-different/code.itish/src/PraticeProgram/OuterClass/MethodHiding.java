package PraticeProgram.OuterClass;


class Demo {
    public  static void method1(){
        System.out.println("Demo class method`1 ` ");
    }
    public void fun(){
        System.out.println("fun of Demo");
    }


}

class Test extends Demo{
    public static void method1(){
        System.out.println("Test class method 1 ````");
    }
    @Override
    public void fun(){
        System.out.println("fun of TEst");
    }
}


public class MethodHiding {
    public static void main(String[] args) {
        Demo d = new Demo();
        Demo t = new Test();
        // method hiding
        d.method1();
        t.method1();
        // method overloading
        d.fun();
        t.fun();

    }
}

