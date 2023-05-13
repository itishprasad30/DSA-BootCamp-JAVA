package AfterLife;

import java.util.Collections;

public class StringDigit {
    public static void main(String[] args) {
        String str = "iti1sh32s5i";



        System.out.println(String.valueOf('1'));
        int sum = 0;
        char []ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if(ch[i]>='0' && ch[i]<='9'){
                int res = Integer.parseInt(String.valueOf(ch[i]));
                sum = sum+res;
            }
        }
        System.out.println(sum);
//        String rev ="";
//        int sum =0;
//        for(int i=0;i<str.length();i++){
//            char ch = str.charAt(i);
//            if(ch>='0'&& ch<='9'){
//
//                sum = sum+ ch-48;
//            }
//        }
//        System.out.println(sum);

    }
}

/*

 */