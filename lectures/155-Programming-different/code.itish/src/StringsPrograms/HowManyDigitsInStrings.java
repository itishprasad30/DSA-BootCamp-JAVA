package StringsPrograms;

import java.util.Scanner;

public class HowManyDigitsInStrings {
    public static void main(String[] args) {

        String str = "Itish2";
        char[] ch = str.toCharArray();
        int dc = 0;
        for (int i = 0; i < str.length(); i++) {
            if(ch[i] >='0'&& ch[i]<='9')
                dc++;

        }
        System.out.println(dc);
    }
}
