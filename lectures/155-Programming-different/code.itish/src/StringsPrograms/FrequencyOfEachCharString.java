package StringsPrograms;

import java.util.Arrays;

public class FrequencyOfEachCharString {
    public static void main(String[] args) {
        String str = "my name is itish3422";
        char []ch = str.toCharArray();
        System.out.println(Arrays.toString(ch));
        stringCharFrequency(ch);
        System.out.println("_______________");
        StrFrequency(str);

    }

    static void StrFrequency(String str) {
        int[] count = new int[128];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            count[ch]++;
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0)
                System.out.println((char) i + " ----> " + count[i]);
        }
    }
    static void stringCharFrequency(char []ch){
        boolean []res = new boolean[ch.length];
        for (int i = 0; i < ch.length; i++) {
            if(!res[i]){
                int count =1;
                for (int j = i+1; j < ch.length; j++) {
                    if(ch[j] == ch[i]){
                        count++;
                        res[j] = true;
                    }
                }
//                if(ch[i]!=' ')
                    System.out.println(ch[i]+ "----> " +count);
            }

        }
    }


}
