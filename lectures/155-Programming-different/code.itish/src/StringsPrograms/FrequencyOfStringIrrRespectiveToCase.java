package StringsPrograms;

import java.util.Arrays;

public class FrequencyOfStringIrrRespectiveToCase {
    public static void main(String[] args) {
        String str = "my name is itIsh";
        char []ch = str.toCharArray();
        System.out.println(Arrays.toString(ch));
        stringCharFrequencyIrrRespectiveCase(ch);

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
