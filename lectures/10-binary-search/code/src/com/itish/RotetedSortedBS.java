package com.itish;

public class RotetedSortedBS {
    public static void main(String[] args) {
        int [] arr = {4,5,6,7,0,1,2,3};
        int target = 3;
        System.out.println(search(arr,target));
    }


    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        if(pivot == -1){
            // do normar BS
            return  binarySearch(nums,target,0,nums.length-1);
        }
        // if pivot found return the pivot, and 2 accesing array

        if(nums[pivot] == target){
            return pivot;
        }
        if(target > nums[0]){
            return binarySearch(nums,target,0,pivot-1);
        }
        return binarySearch(nums,target,pivot+1,nums.length-1);

    }
    static int binarySearch(int[] arr,int target,int start,int end){
        // 1. find the mid element

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
    // find the pivot- largest element in the array
    static int findPivot(int[] arr){
        int start=0;
        int end=arr.length -1;

        while (start<=end){
            int mid = start + (end-start)/2;
            // we have 4 cases
            // if mid > mid+1 => pivot
            if(mid< end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid+1]){
                return mid -1;
            }
            if(arr[mid] <= arr[start]){
                 end= mid-1;
            }else {
                start = mid+1;
            }

        }
        return -1;

    }
}
