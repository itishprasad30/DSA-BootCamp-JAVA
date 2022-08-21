package itish.AccessModifiers;

public class StingImutable {
    public static void main(String[] args) {
        String s = "Itish ";
        String s1 =s.concat("Prasad");
        System.out.println(s); // itish will print because In String pool one s refs to itish , when you concat another new things are created
        System.out.println(s1);

       String s3 = "Men";
       String s4 = "Men"; // s3,s4 refercing to the same one things because of String pool;



    }
}
