package com.itish;
// https://leetcode.com/problems/find-smallest-letter-greater-than-target/
//Given a characters array letters that is sorted in non-decreasing order and a character target, return the smallest character in the array that is larger than target.
//
//        Note that the letters wrap around.
//
//        For example, if target == 'z' and letters == ['a', 'b'], the answer is 'a'.
//
//
//        Example 1:
//
//        Input: letters = ["c","f","j"], target = "a"
//        Output: "c"
//        Example 2:
//
//        Input: letters = ["c","f","j"], target = "c"
//        Output: "f"
//        Example 3:
//
//        Input: letters = ["c","f","j"], target = "d"
//        Output: "f"
public class SmallestLetter {
    public static void main(String[] args) {
        char[] arr ={'c','f','j'};
        char target = 'd';
        char ans = nextGreatestLetter(arr,target);
        System.out.println(ans);

    }
    static public char nextGreatestLetter(char[] letters, char target) {

        int start =0;
        int end = letters.length -1;
        while (start<=end) {

            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;

            }
        }
        // if the element not found
       return letters[start % letters.length];
    }
}
