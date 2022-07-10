package com.itish;

public class BinarySearch {
    public static void main(String[] args) {
        // asumming sorted array
        int [] arr ={2,4,6,8,10,45,78,98};
        int target = 98;
        int result = binarySearch(arr,target);
        System.out.println("The Element found at index no :" + result);

    }
    static int binarySearch(int[] arr,int target){
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
        return -1;
    }
}
