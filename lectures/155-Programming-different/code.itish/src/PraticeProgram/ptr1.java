package PraticeProgram;

import java.util.Scanner;
/*
Enter the Number of Lines
5
        0
      1 0 1
    0 1 0 1 0
  1 0 1 0 1 0 1
0 1 0 1 0 1 0 1 0

 */

public class ptr1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number of Lines");
        int n = in.nextInt();
        int x = 2;


        for (int i = 1; i<=n ; i++) {
            for (int j = i; j <= n-1 ; j++) {
                System.out.print("  ");

            }
            for(int j = 1; j <= (2 * i - 1); j++)
            {

                System.out.print(x%2+ " ");
                x++;

            }

            System.out.println();
        }
    }
}
