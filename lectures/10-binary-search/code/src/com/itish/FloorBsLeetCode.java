package com.itish;

public class FloorBsLeetCode {
    public static void main(String[] args) {
        int [] arr = {2,3,5,9,14,16,18};
        int target = 15;
        int ans = floor(arr,target);
        System.out.println("Florring of number is : " + ans);

    }

    // floor: greatest number <= equals to target
    // return the index of
    static int floor(int[] arr,int target){
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
        return end;
    }
}
