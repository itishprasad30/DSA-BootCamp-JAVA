package Patterns;

import java.util.Scanner;
/*
Enter the Number of Lines
5
A B C D E D C B A
  A B C D C B A
    A B C B A
      A B A
        A

 */
public class advptr6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number of Lines");
        int n = in.nextInt();
        for (int i = 1; i<=n ; i++) {
            for (int j = 1; j <= i-1 ; j++) {
                System.out.print("  ");
            }
            int x = 1;

            for(int j = 1; j <= 2*(n-i)+1 ; j++)
            {
                System.out.print((char)( x+64)+ " ");
                if(j<=n-i)
                    x++;
                else
                    x--;

            }

            System.out.println();
        }
    }
}
