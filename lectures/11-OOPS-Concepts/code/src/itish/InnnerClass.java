package itish;
// class Test {
//    static String name;
//
//    public Test(String name) {
//        Test.name = name;
//    }
//}
public class InnnerClass {
    static class Test {
        String name;

        public Test(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Itish Prasad");
        Test b = new Test("Hailee Stenfild");

        System.out.println(a);

        System.out.println(a.name);
        System.out.println(b.name);

    }
}
