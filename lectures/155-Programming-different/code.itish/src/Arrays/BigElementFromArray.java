package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BigElementFromArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array : ");

        int size = in.nextInt();
        System.out.println("Enter the array elements: ");
        int[] a = new int[size];
        for (int i = 0; i < a.length ; i++) {
            a[i] = in.nextInt();
        }


//        int [] a ={1,2,3,44,5};

        System.out.println(Arrays.toString(a));
        int big = getBig(a);


        System.out.println("Big Element is  " + big);
    }

     static int getBig(int[] a) {
         int big = a[0];
         for (int i = 1; i < a.length; i++) {
             if(a[i] > big)
                 big = a[i];
         }
         return big;
    }
}
