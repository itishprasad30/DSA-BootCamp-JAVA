package com.itish;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArr {

    public static void main(String[] args) {

        /*
        1 2 3
        4 5 6
        7 8 9
         */
        Scanner in = new Scanner(System.in);

        //int [] [] arr = new int[3][3];  // first is no.row mandatory ,second col not mandatory
        // directily store in this way
//        int[][] arr2d = {
//                {1,2,3}, // 0th index
//                {4,5,6}, // 1st index
//                {7,8,9}  // 2nd index arr2d[2] -> 7,8,9
//        };

        int [][] arr =  new int[3][3];
        System.out.println(arr.length); // no.of rows -> 3
        // input

        for (int row = 0; row < arr.length; row++) {
            // for each column in every row
            for(int col=0;col< arr[row].length ; col++){
                arr[row][col] = in.nextInt();
            }

        }
        // output
        for(int row = 0; row < arr.length; row++) {
            // for each column in every row
            for(int col=0;col< arr[row].length ; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();

        }

        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));

        }
        // output with arrarys.tostring() enhanced for loop forEach
        for(int[] a: arr){
            System.out.println(Arrays.toString(a));

        }

    }
}
