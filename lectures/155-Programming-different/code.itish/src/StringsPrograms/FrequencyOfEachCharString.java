package StringsPrograms;

import java.util.Arrays;

public class FrequencyOfEachCharString {
    public static void main(String[] args) {
        String str = "my name is itish";
        char []ch = str.toCharArray();
        System.out.println(Arrays.toString(ch));
        stringCharFrequency(ch);
        StrFrequency(str);
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
                if(ch[i]!=' ')
                    System.out.println(ch[i]+ "----> " +count);
            }

        }
    }

    static void StrFrequency(String str){

        int [] count = new int[26];
        char []chr = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            char ch =str.charAt(i);
            if(ch>='A' && ch<='Z'){
                count[ch-65]++;
            }
            if(ch>='a'&& ch<='z'){
                count[ch-97]++;
            }
        }



        for (int i = 0; i < count.length; i++) {
            if(str.charAt(i)!=' ')
                System.out.println(count[i]+ "----> " +str.charAt(i));
        }



    }
}
