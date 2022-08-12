package Patterns;

import java.util.Scanner;
//Enter the lines Number:
//        5

//        5
//        5 4
//        5 4 3
//        5 4 3 2
//        5 4 3 2 1

public class ptr14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the lines Number: ");
        int n = in.nextInt();

        for (int i = n;i>=1 ; i--) {
            for (int j=n;j>=i;j--) {
                System.out.print(j + " ");
            }
            System.out.println();

        }
    }
}
