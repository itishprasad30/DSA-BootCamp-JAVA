package itish.AbstractDemo;

public class Son extends  Parent{

    Son(int age) {
        super(age);
    }

    @Override
    void normal() {
        super.normal();
    }

    @Override
    void carrier() {
        System.out.println("i am going to Doctor " );
    }

    @Override
    void partner() {
        System.out.println(" i love Haille Steinfield" );

    }
}
