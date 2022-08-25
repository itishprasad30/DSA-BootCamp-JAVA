package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RevArray {
//    static int[] readArray(){
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the Size of Array");
//
//        int size = in.nextInt();
//        int [] arr = new int[size];
//        System.out.println("Enter the elements of Array ");
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }
//        return arr;
//    }
    public static void main(String[] args) {
//        int []a = readArray();
        int []a = {1,2,3,4,5};
        reverse(a);
        System.out.println(Arrays.toString(a));
    }

    static void reverse (int [] arr){
        int start =0;
        int end = arr.length -1;

        while (start<end){
            // swap
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    static void swap(int [] arr,int s,int e){
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
}
