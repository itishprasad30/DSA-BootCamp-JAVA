package Arrays;
import java.io.*;
import java.util.Arrays;
import java.util.Collections;
public class AnigrumOrNot {




        static boolean areAnagram(char[] str1, char[] str2)
        {

            int n1 = str1.length;
            int n2 = str2.length;


            if (n1 != n2)
                return false;


            Arrays.sort(str1);
            Arrays.sort(str2);


            for (int i = 0; i < n1; i++)
                if (str1[i] != str2[i])
                    return false;

            return true;
        }

        // anthor code
        public boolean isAnagram(String s, String t) {
            if(s.length() != t.length())
                return false;

            int [] arr = new int[26];

            for(int i=0; i< s.length(); i++){
                arr[s.charAt(i) - 'a']++;
            }

            for(int i=0; i< s.length(); i++){
                arr[t.charAt(i) - 'a']--;
            }

            for(int i=0;i<arr.length;i++){
                if(arr[i]!=0){
                    return false;
                }
            }

            return true;

        }


        public static void main(String args[])
        {
            char str1[] = { 'c','a','t'};
            char str2[] = { 't', 'c', 'a' };

            if (areAnagram(str1, str2))
                System.out.println("The two strings are"
                        + " anagram of each other");
            else
                System.out.println("The two strings are not"
                        + " anagram of each other");
        }

}
