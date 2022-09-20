package StringsPrograms;

import java.util.Arrays;

public class FrequencyOfStringIrrRespectiveToCase {
    public static void main(String[] args) {
        String str = "my name is itIsh";
        char []chr = str.toCharArray();
        System.out.println(Arrays.toString(chr));
        //stringCharFrequencyIrrRespectiveCase(ch);
        int []count = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch >='A'&& ch <='Z')
                count[ch-65] ++;
            if(ch >='a'&& ch<='z')
                count[ch-97]++;

        }
        for (int i = 0; i < count.length; i++) {
            if(count[i]!= 0)
                System.out.println((char) (i+65) + "----->>> " + count[i]);
        }



    }


    static void stringCharFrequencyIrrRespectiveCase(char []ch){
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
                if(ch[i]!=' ' )
                    System.out.println(ch[i]+ "----> " +count);
            }

        }
    }
}
