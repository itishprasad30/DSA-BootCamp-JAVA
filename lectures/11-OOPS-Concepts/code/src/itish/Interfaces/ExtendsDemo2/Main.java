package itish.Interfaces.ExtendsDemo2;

public class Main implements A,B{
    @Override
    public void greet() {
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.fun(); // I am in A
        m.fun2(); // I am in B
        A.display(); //Hey i am in static interface
    }
}
