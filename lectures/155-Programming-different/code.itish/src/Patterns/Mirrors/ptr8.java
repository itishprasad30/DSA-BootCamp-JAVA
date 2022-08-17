package Patterns.Mirrors;

import java.util.Scanner;

/*
Enter the lines:
9
        * * * * * * * * *
        *       *       *
        *       *       *
        *       *       *
        * * * * * * * * *
        *       *       *
        *       *       *
        *       *       *
        * * * * * * * * *

Process finished with exit code 0

 */

public class ptr8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the lines: ");
        int n = in.nextInt();
        for (int i = 1;i<=n;i++){
            for (int j = 1; j <=n ; j++) {
                if( i==1 || i== n || j==1 || j ==n || j == n/2+1 || i == n/2+1){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }

    }
}
