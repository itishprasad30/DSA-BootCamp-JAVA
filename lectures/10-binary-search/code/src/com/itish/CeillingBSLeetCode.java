package com.itish;

public class CeillingBSLeetCode {
    public static void main(String[] args) {
        int [] arr = {2,3,5,9,14,16,18};
        int target = 19;
        int ans = ceilling(arr,target);
        System.out.println("Ceilling of number is : " + ans);


    }

    // ceilling : smallest no. greater than equal to target
    // return index
    static int ceilling(int[] arr,int target){

        // but what if the target element is greater than the greast number in the array
        if(target > arr[arr.length -1]){
            return -1;
        }

        // 1. find the mid element
        int start =0;
        int end = arr.length -1;
        while (start<=end){
            // find mid element
            // this might cause int exceed issue;
            //  int mid =( start - end )/ 2;
            int mid = start + (end -start) /2;

            if(target < arr[mid]){
                end = mid -1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }else {
                return mid;// ans found
            }
        }
        // if the element not found
        return start;
    }
}
