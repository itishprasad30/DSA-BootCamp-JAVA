package itish;

public class WrapperIntro {
    public static  void main(String[] args) {
        // its primitive type data to store the 12 object
        // java people create this to increase is perforamnce for this
        // so java is fast as compare to python

//        int a = 12;
//        System.out.println(a);// 12
        // wrapper class is int type object to create a object
        // obj.properties or function you can access
        // Integer num = new Integer(45);
        Integer obj = 32;
        System.out.println(obj);// 32

//        int a =21,b =54;
        Integer a =22,b =55;
        swap(a,b);
        System.out.println(a + " " + b);

        A objw = new A("itish");
        System.out.println(objw);

//        for (int i = 0; i < 1000000; i++) {
//            objw = new A("random name"); // so many times object is destroyed will print
//
//        }

    }



    static void swap (Integer a,Integer b){
        int temp = a;
        a = b;
        b= temp;
//        System.out.println(a + " " + b);
    }
}

class A {
    String name;
    public A(String name){
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
//        super.finalize();
    }
}
