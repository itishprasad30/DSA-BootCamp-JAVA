package com.itish;

import java.util.Arrays;
// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/submissions/

//Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
//
//        If target is not found in the array, return [-1, -1].
//
//        You must write an algorithm with O(log n) runtime complexity.
//
//
//
//        Example 1:
//
//        Input: nums = [5,7,7,8,8,10], target = 8
//        Output: [3,4]
//        Example 2:
//
//        Input: nums = [5,7,7,8,8,10], target = 6
//        Output: [-1,-1]
//        Example 3:
//
//        Input: nums = [], target = 0
//        Output: [-1,-1]
public class FirstAndLastElementTarget  {
    public static void main(String[] args) {

        int[] arr = {3,7,7,7,7,8,8,9};
        int target = 7;
        int[] ans = searchRange(arr,target);
        System.out.println(Arrays.toString(ans));

    }
   static public int[] searchRange(int[] nums, int target) {

        int [] ans = {-1,-1};
        int start = search(nums,target, true);
        int end = search(nums,target,false);

        ans[0]= start;
        ans[1] = end;
        return ans;


    }

    static int search (int[] nums,int target,boolean findSearchIndex){
        int ans = -1;
        int start =0;
        int end = nums.length -1 ;
        while (start<= end){
            int mid = start + ( end-start)/2;

            if(target < nums[mid]){
                end = mid-1;
            }else if (target > nums[mid]){
                start = mid+1;
            }else {
                // pontal answer
                ans = mid;
               if(findSearchIndex){
                   end = mid -1;
               }else {
                   start = mid +1;
               }
            }

        }
        return ans;
    }
}
