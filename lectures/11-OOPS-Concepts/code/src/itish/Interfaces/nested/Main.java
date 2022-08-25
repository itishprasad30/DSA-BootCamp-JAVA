package itish.Interfaces.nested;

public class Main {
    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj.isOdd(5)); // true
        System.out.println(obj.isOdd(6)); // false
    }
}
