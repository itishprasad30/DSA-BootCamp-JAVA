package Patterns;

import java.util.Scanner;


/*
Enter the Number of Lines
5
1 * 2 * 3 * 4 * 5
  1 * 2 * 3 * 4
    1 * 2 * 3
      1 * 2
        1

 */


public class advptr8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number of Lines");
        int n = in.nextInt();
        for (int i = n; i>=1 ; i--) {
            for (int j = 1; j <= n-i ; j++) {
                System.out.print("  ");
            }


            for(int j = 1; j <= i ; j++)
            {
                System.out.print( j+ " ");
                if(j< i)
                    System.out.print("* ");

            }

            System.out.println();
        }

    }
}

