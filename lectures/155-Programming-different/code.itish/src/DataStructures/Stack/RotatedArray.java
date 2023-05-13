package DataStructures.Stack;

import java.util.Arrays;

//Input: nums = [1,2,3,4,5,6,7], k = 3
//        Output: [5,6,7,1,2,3,4]
public class RotatedArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int k = 3;
        rotaterev(arr,k);
        System.out.println(Arrays.toString(arr));
    }
    static void rotaterev(int []nums,int k){
        int n = nums.length;
        k = k %n;
        rotate(nums,0,n-1);
        rotate(nums,0,k-1);
        rotate(nums,k,n-1);
    }
    static void rotate(int []arr,int s,int e){
        while (s<e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
}
