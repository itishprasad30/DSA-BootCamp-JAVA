package itish.Strings;

public class Main {
    public static void main(String[] args) {
        String name1 = "itish";
        String name2 = "itish";
        System.out.println(name1 == name2);// true one object pointing to two reference varible
        System.out.println(name1.equals(name2));
     
        String s1 = new String("ITISH");
        String s2 = new String("ITISH");
        System.out.println(s1== s2);//false  two different object and pointing to two different reference variable
        System.out.println(s1.equals(s2)); // true

        System.out.println(name1 .equals(s1));

        String ss = null;
        System.out.println(ss);// null pointer exception

    }
}
