package Patterns;

import java.util.Scanner;
//Enter the lines Number:
//        5
//        5
//        4 5
//        3 4 5
//        2 3 4 5
//        1 2 3 4 5


public class ptr19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the lines Number: ");
        int n = in.nextInt();

        for (int i = n;i>=1 ; i--) {
            for (int j=i;j<=n;j++) {
                System.out.print(j + " ");
            }
            System.out.println();

        }
    }
}
