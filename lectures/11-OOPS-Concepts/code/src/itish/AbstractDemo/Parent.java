package itish.AbstractDemo;

public abstract class Parent {
    // final - > prevents inheitance
    // you can't final abstract class

    static int a =23;
    int age;
    final int VALUE ;
    Parent(int age){
        this.age= age;
        VALUE = 4548;
    }

    abstract void carrier();
    abstract void partner();
    // you can create normal method along with static methods
    // acces it via class name Parent.hello()
    static void hello(){
        System.out.println("hello static methods");
    }

    // normal methods
    void normal(){
        System.out.println("Its a normal methods");
    }

    // can't create Abstract Constructor
//    abstract Parent(){
//
//    };
    // can't create abstrct static methods
//    abstract static fun(){
//        System.out.println("hello");
//    }


//    -------------------------

}
