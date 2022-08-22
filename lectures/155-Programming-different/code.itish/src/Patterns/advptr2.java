package Patterns;

import java.util.Scanner;
/*
Enter the Number of Lines
5
1 2 3 4 5 4 3 2 1
  2 3 4 5 4 3 2
    3 4 5 4 3
      4 5 4
        5
 */

public class advptr2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number of Lines");
        int n = in.nextInt();
        for (int i = 1; i<=n ; i++) {
            for (int j = 1; j <= i-1 ; j++) {
                System.out.print("  ");
            }
            int x = i;

            for(int j = 1; j <= 2*(n-i)+1 ; j++)
            {
                System.out.print(x+ " ");
                if(j<=n-i)
                    x++;
                else
                    x--;

            }

            System.out.println();
        }
    }
}
