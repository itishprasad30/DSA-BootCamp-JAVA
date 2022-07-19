package com.itish;

public class FindInMountainArray {
    // leetcode hard question nothing just copy paste
    //https://leetcode.com/problems/find-in-mountain-array/

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 6;
        System.out.println(search(arr,target));
    }
    static  int search (int[] arr,int target ){
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderDiagonalisedBS(arr,target,0,peak);
        if(firstTry != -1){
            return firstTry;
        }
        return orderDiagonalisedBS(arr,target,peak+1,arr.length-1);
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

        return start;// return end because start and end are equals
    }
    static int orderDiagonalisedBS(int [] arr, int target,int start,int end){


        // find weather arr is sorted in asc or desc
        boolean isAsc = arr[start] < arr[end];

        while (start <= end){
            // find mid
            int mid = start +( end - start)/ 2;

            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){

                if(target < arr[mid]){
                    end = mid-1;
                }
                else {
                    start = mid+1;
                }
            }else {
                if(target > arr[mid]){
                    end = mid-1;
                }
                else {
                    start = mid+1;
                }
            }
        }

        return -1;
    }
}
