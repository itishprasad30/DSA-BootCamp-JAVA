package Arrays;

import java.util.Scanner;

public class AvgofArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array : ");

        int size = in.nextInt();
        System.out.println("Enter the array elements: ");
        int[] arr = new int[size];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = in.nextInt();
        }
        double sum=0;

        for (int i = 0; i < arr.length; i++) {
            sum= sum + arr[i];
        }
        double avg = sum / arr.length;

        System.out.println("Avg of array elements is : " + avg);

    }
}
