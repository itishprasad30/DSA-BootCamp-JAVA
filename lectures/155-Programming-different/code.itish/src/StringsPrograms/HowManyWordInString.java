package StringsPrograms;

import java.util.Scanner;

public class HowManyWordInString {
    public static void main(String[] args) {

        String s1 = "some value is there the word";
        String[] s2 = s1.split(" ");
        int words = s2.length;
        System.out.print("Number of words in the string: " + words);
    }

}
