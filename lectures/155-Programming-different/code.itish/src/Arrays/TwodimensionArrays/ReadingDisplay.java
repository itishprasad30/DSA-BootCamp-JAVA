package Arrays.TwodimensionArrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReadingDisplay {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no. of Rows and Cols");
        int row = in.nextInt();
        int col = in.nextInt();
        int[][] arr = new int[row][col];
        System.out.println("Enter the all the " + row*col+ " elements in the rows wise : ");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextInt();

            }
        }
        // for displaying the all the elements
        System.out.println("The matrix you entered is : Like that");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print( arr[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

        // For the static
//        int [][] matrix = {
//                    {1,2,3},
//                    {7 ,8},
//                     {9 , 8 ,5 ,2}
//                        };
//        System.out.println(Arrays.toString(matrix));
//        System.out.println("The matrix you entered is : Like that");
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print( arr[i][j] + " ");
//            }
//            System.out.println();
//        }


    }
}
