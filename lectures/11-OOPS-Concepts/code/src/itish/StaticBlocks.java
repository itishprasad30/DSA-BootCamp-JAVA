package itish;

public class StaticBlocks {
    static int a = 5 ;
    static int b; // 0

    // only runs once i:e when the first object is create i:e when the class is loaded;
    static {
        System.out.println("I am in Static Block"); // 1st print this
        b = a * 5; // b = 25
    }

    public static void main(String[] args) {
        System.out.println(a + " " + b); // 5  25
        StaticBlocks s1 = new StaticBlocks();
        System.out.println(StaticBlocks.a + " " + StaticBlocks.b); //5  25
        StaticBlocks.b+= 5; // 30
        StaticBlocks s2 = new StaticBlocks();
        System.out.println(StaticBlocks.a + " " + StaticBlocks.b); // 5 30

    }

}
