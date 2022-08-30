package Patterns.DemoAdvPtr;

import java.util.Scanner;

/*
Enter the Number of Lines
7
            1
          1 * 2
        1 * 2 * 3
      1 * 2 * 3 * 4
    1 * 2 * 3 * 4 * 5
  1 * 2 * 3 * 4 * 5 * 6
1 * 2 * 3 * 4 * 5 * 6 * 7


 */

public class advPtr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number of Lines");
        int n = in.nextInt();
        for (int i = 1; i<=n ; i++) {
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
