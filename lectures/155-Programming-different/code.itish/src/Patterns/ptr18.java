package Patterns;

import java.util.Scanner;

//Enter the lines Number:
//        5

//        1
//        2 6
//        3 7 10
//        4 8 11 13
//        5 9 12 14 15

public class ptr18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the lines Number: ");
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
           int k=i;
            for (int j = 1; j<=i; j++) {
                System.out.print(k+" ");
                k=k+n-j;

            }
            System.out.println();

        }
    }
}
