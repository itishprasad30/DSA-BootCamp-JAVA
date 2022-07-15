package com.itish;

public class MountainArray {
//    https://leetcode.com/problems/peak-index-in-a-mountain-array/
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,4,3,2};
        int ans = peakIndexInMountainArray(arr);
        System.out.println(ans);


    }
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length -1;

        while ( start< end){
            int mid = start + (end -start)/2;

            if(arr[mid]  > arr[mid+1]){
                // you are in decresing part of array
                // this may be the ans may be look at left
                // this is why end != mid -1;
                end = mid;
            }else {
                start = mid +1; // mid +1 is > than mid element ,
                // you are in accending part of array
             }

        }
        // in the end start == end pointing to largest element becz two checks
        // start , end always find max element in the above two checks
        // hence pointing to one element that max element
        // more elaboreation every start and end they are best posivble ans till that time
        // if you are saying that only one element is laying then best posible ans
        return start;// or end both are equals
    }
}
