package Arrays;

import java.util.Scanner;


public class MergeTwoArr {
    public static void main(String[] args) {


        System.out.println("Read first Array");
        int []x = readArray();
        System.out.println("Read second Array");
        int []y = readArray();

        System.out.println("User Enter first Array ");
        displayArr(x);
        System.out.println("User Enter Second Array ");
        displayArr(y);

        int []c = mergeArray(x,y);
        System.out.println("Merged two array "  );
        displayArr(c);

    }

     static void displayArr(int[] x) {
         for (int i = 0; i < x.length; i++) {
             System.out.println(x[i] + " ");

         }
    }

     static int[] mergeArray(int[] x, int[] y) {
        int []c = new int[x.length + y.length];
        for (int i = 0; i < x.length; i++) {
            c[i] = x[i];

        }
        for (int i = 0; i < y.length; i++) {
            c[x.length + i] = y[i];

        }
        return c;
    }

    static int[] readArray() {
         Scanner in = new Scanner(System.in);
         System.out.println("Enter the size of array : ");

         int size = in.nextInt();
         System.out.println("Enter the array elements: ");
         int[] arr = new int[size];
         for (int i = 0; i < arr.length ; i++) {
             arr[i] = in.nextInt();
         }
        return  arr;
    }
}
