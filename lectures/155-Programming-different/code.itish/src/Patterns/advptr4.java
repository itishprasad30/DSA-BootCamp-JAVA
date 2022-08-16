package Patterns;

import java.util.Scanner;
//Enter the Number of Lines
//        5
//        1 0 1 0 1 0 1 0 1
//          1 0 1 0 1 0 1
//            1 0 1 0 1
//              1 0 1
//                1

public class advptr4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number of Lines");
        int n = in.nextInt();
        for (int i = n; i>= 1 ; i--) {
            for (int j = i; j < n ; j++) {
                System.out.print("  ");
            }

            for(int j = 1; j <= (2 * i - 1); j++)
            {
                System.out.print(j%2+ " ");
            }

            System.out.println();
        }
    }
}
