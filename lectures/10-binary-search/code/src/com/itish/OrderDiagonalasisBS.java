package com.itish;

public class OrderDiagonalasisBS {
    public static void main(String[] args) {
//        int[] arr = {2,4,6,8,10,45,78,98};
        int[] arr = {99,88,74,55,21,12,5};
        int target = 12;
        int result = orderDiagonalisedBS(arr,target);
        System.out.println(result);

    }
    static int orderDiagonalisedBS(int [] arr, int target){
        int start= 0;
        int end = arr.length -1;

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
