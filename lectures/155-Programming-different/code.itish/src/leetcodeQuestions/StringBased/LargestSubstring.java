package leetcodeQuestions.StringBased;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LargestSubstring {
    public static void main(String[] args) {
        String input = "itish prasad";
        String result = removeDuplicates(input);
        System.out.println(result);
    }

    public static String removeDuplicates(String str) {
        StringBuilder sb = new StringBuilder();
        HashSet<Character> seen = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!seen.contains(c)) {
                seen.add(c);
                sb.append(c);
            }
        }

        return sb.toString();
    }
//    public static void main(String[] args) {
//        String str = "itish";
//        System.out.println(lengthOfLongestSubString(str));
//
//    }
//    public static Set<Character> lengthOfLongestSubString(String str){
//        int i=0,j=0,max=0;
//        Set<Character> set = new HashSet<>();
//        while (j<str.length()){
//            if (!set.contains(str.charAt(j))){
//                set.add(str.charAt(j++));
//                max = Math.max(max,set.size());
//            }else {
//                set.remove(str.charAt(i++));
//            }
//        }
//        return set;
//    }
}
