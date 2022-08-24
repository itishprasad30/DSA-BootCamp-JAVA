package itish.AbstractDemo;

public class Main {
    public static void main(String[] args) {
        Son s = new Son(23);
        s.carrier();
        System.out.println(s.age);
        Parent.hello();
        s.normal();
        Daughter d = new Daughter(19);
        d.carrier();
        // but you can't create a object of parent class
//        like that
//        Parent pp = new Parent(222);
        // like that in the below program you can do that like that

       Parent p = new Parent(22) {
           @Override
           void carrier() {
               System.out.println("carrier is something");
           }

           @Override
           void partner() {
               System.out.println("partner is me");
           }
       };
       p.carrier();
       p.partner();
    }



}
