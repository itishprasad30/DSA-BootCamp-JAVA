package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        int[][] arr = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };


//        for (int[] a :arr) {
//        System.out.println(Arrays.toString(a));
//        }
        int [][]arr = new int[2][3];
        System.out.println(arr.length);// no of row

        for (int i = 0; i < arr.length; i++) {
            // for each colomn
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }

//        for(int row = 0; row < arr.length; row++) {
//            // for each column in every row
//            for(int col=0;col< arr[row].length ; col++){
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//
//        }

        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));

        }

    }
}
