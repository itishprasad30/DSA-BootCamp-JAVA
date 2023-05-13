package ArrayAndHashing;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "cat";
        String s2 = "atc";
        String str = isAnagram(s1, s2) ? "Is Anagram" : "Not Anagram";
        System.out.println(str);
    }
    public static boolean isAnagram(String s1,String s2){
        if(s1.length()!= s2.length())
            return false;

        int []arr = new int[26];
        for(int i =0;i<s1.length();i++){
            arr[s1.charAt(i)-'a']++;
        }
        for(int i =0;i<s1.length();i++){
            arr[s2.charAt(i)-'a']--;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!= 0)
                return false;
        }
        return true;
    }
}
