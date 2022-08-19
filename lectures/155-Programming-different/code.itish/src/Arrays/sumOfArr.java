package Arrays;

import java.util.Scanner;

public class sumOfArr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array : ");

        int size = in.nextInt();
        System.out.println("Enter the array elements: ");
        int[] arr = new int[size];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = in.nextInt();
        }
        int sum=0;

        for (int i = 0; i < arr.length; i++) {
            sum= sum + arr[i];

        }
        System.out.println("Sum of array elements is : " + sum);
    }
}
