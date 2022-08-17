package Patterns.Mirrors;

import java.util.Scanner;
/*
Enter the lines:
7
        *     *     *
          *   *   *
            * * *
        * * * * * * *
            * * *
          *   *   *
        *     *     *
 */
public class ptr9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the lines: ");
        int n = in.nextInt();
        for (int i = 1;i<=n;i++){
            for (int j = 1; j <=n ; j++) {
                if(  i==j || i+j== n+1 || i== n/2+1 || j== n/2+1){
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
