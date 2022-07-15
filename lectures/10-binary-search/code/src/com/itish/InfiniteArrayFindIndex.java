package com.itish;
// Amazon interview question
// Link:
// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/

public class InfiniteArrayFindIndex {
    public static void main(String[] args) {
        int [] arr = {3,5,7,9,10,90,100,130,140,160,170};
        int target = 10;
        System.out.println(ans(arr,target));

    }
    static  int ans (int[] arr,int target){
        // find the range
        // first start with a box of size 0

        int start = 0;
        int end = 1;
        // condition for target lies in range

        while(target > arr[end]){
            // this is my new start
            int newStart = end+1;
            // double the box value
            // end = end + (end -start +1 ) * 2
            end = end + (end -start +1 )*2;
            start = newStart;
        }
        return binarySearch(arr,target,start,end);
    }

     static int binarySearch (int[] arr,int target,int start,int end) {

        while (start <= end){
            int mid = start + (end-start)/2;

            if(target < arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid]){
                start = mid+1;
            }else {
                return  mid;
            }
        }
        return -1;
    }
}
