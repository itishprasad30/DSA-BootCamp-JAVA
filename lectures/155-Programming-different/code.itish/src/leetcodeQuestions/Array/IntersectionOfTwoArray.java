package leetcodeQuestions.Array;

import java.util.Arrays;
import java.util.HashSet;

/*
 Intersection of Two Arrays
Easy



Share
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.



Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.
 */
public class IntersectionOfTwoArray {
    public static void main(String[] args) {
        int [] nums1 = {4,9,5};
        int []nums2 = {9,4,9,8,4};
        int[] res = intersection(nums1,nums2);
        System.out.println(Arrays.toString(res));
    }
    public  static int[] intersection(int[] nums1,int[] num2){
        HashSet<Integer> set = new HashSet<>();
        for (int i: nums1){
            set.add(i);
        }

        HashSet<Integer> intersec = new HashSet<>();
        for (int i : num2){
            if(set.contains(i)){
                intersec.add(i);
            }
        }

        int res[] = new int[intersec.size()];

        int in = 0;
        for(int i: intersec){
            res[in++] = i;
        }
        return res;
    }
}
