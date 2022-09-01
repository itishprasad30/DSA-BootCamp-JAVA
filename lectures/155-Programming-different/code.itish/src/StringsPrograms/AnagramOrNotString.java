package StringsPrograms;

public class AnagramOrNotString {

    public static void main(String[] args) {
        String str1 = "cat";
        String str2 = "tac";
        boolean res = isAnagram(str1,str2);
        if (res)
            System.out.println("Anagram");
        else
            System.out.println("Not anagram");
    }
    static boolean isAnagram (String s1,String s2){
        if(s1.length()!=s2.length())
            return false;

        int []count1 = frequency(s1);
        int []count2 = frequency(s2);
        for (int i = 0; i < count1.length; i++) {
            if(count1[i]!= count2[i])
                return false;
        }
        return true;
    }

     static int[] frequency(String str) {
        int []count = new int[26];

         for (int i = 0; i < str.length(); i++) {
             char ch =str.charAt(i);
             if(ch>='A' && ch<='Z'){
                 count[ch-65]++;
             }
             if(ch>='a'&& ch<='z'){
                 count[ch-97]++;
             }
         }
         return count;
    }
}
