package StringsPrograms;

public class Basics {
    public static void main(String[] args) {
        /*
         1.String is a Final class,Present in System.lang Class 16 Overloaded Constructor are presents
         2.two ways to create String
               1.String literals--- String s1= "Itish";    -> String pool
               2.Using Constructor --- String s2 = new String("Itish");  -> heap area
              Strings are immutable in java.
          3. String have some Predefined methods are there

              but Stringbuffer and Stringbuilder are mutable.

         */

        String s1 = "itish";
        String s2 = "itish";
        String s3 = new String("Prasad");

        System.out.println(s1); // itish
        System.out.println(s2); // itish
        System.out.println(s3); // Prasad

        System.out.println(s1.length());// 5
        System.out.println(s1.charAt(3));//s
        //System.out.println(s1.charAt(6)); //.StringIndexOutOfBoundsException

        System.out.println(s1.indexOf('h'));// 5
        System.out.println(s1.indexOf('p')); // -1
        System.out.println(s1.indexOf('i')); // 0  first occurrence it checks
        System.out.println(s1.lastIndexOf('i')); //2  last occurrence of index value
        System.out.println(s1.indexOf('i',0)); // 0
        System.out.println(s1.indexOf('i',1)); // 2
        System.out.println(s1.indexOf('m',0)); // -1

    }
}
