package leetcodeQuestions.StringBased;

import java.util.Stack;
/*
316. Remove Duplicate Letters
Given a string s, remove duplicate letters
so that every letter appears once and only once.
You must make sure your result is the smallest in lexicographical
order among all possible results.

Input: s = "bcabc"
Output: "abc"
Input: s = "cbacdcbc"
Output: "acdb"

 */
public class RemoveDuplicateCharFromString {
    public static void main(String[] args) {
        String str = "amazon";
        System.out.println(removeDuplicateLetters(str));


    }
    public static String removeDuplicateLetters(String s) {
        int []lastIndex = new int[26];

        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) -'a'] = i;  // track the lastIndex of character presence
        }
        boolean []seen = new boolean[26]; //   keep track seen

        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            int curr = s.charAt(i) -'a';

            if(seen[curr])
                continue; //  if seen continue as we need to pick one char only
            while (!st.isEmpty() && st.peek() > curr && i<lastIndex[st.peek()])
            {
                seen[st.pop()]=false;  // pop out and mark unseen
            }
            st.push(curr); //  add into stack
            seen[curr] = true; // mark seen
        }
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()){
            sb.append((char) (st.pop() +'a'));
        }
        return sb.reverse().toString();

    }
}
