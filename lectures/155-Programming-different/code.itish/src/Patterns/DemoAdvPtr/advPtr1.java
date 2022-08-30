package Patterns.DemoAdvPtr;

import java.util.Scanner;

public class advPtr1 {
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
