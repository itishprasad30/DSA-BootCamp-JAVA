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
    }



}
