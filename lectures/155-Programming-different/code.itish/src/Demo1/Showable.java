package Demo1;

public interface Showable {
   void print();
    int rooll = 234;
    default void hello(){
        System.out.println("hello from default");
    }
    static void hm(){
        System.out.println("static methods");
    }

    public static void main(String[] args) {
        System.out.println("From main Method of Showable and ");
        hm();
    }

}
