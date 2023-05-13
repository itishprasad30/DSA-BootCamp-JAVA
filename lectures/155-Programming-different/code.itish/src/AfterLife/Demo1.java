package AfterLife;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args)
    {
        String str = "my name is shiva";

        preserveSpace(str);
    }
    static void preserveSpace(String str){
        int n = str.length();
        int start = 0;
        int end = n-1;

        char[] chars = str.toCharArray();

        while (start<end){
            // ignore space at start and end
            if(chars[start]==' '){
                start++;
            }else if(chars[end]==' '){
                end--;

            }else {
                char temp = chars[start];
                chars[start] = chars[end];
                chars[end] = temp;
                start++;
                end--;
            }

        }
        System.out.println(String.valueOf(chars));


    }
}
