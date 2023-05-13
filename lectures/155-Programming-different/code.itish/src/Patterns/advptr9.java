package Patterns;

import java.util.Scanner;



//Enter the Number of Lines
//        5
//          1
//        1   1
//      1   2   1
//    1   3   3   1
//  1   4   6   4   1

public class advptr9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number of Lines");
        int n = in.nextInt();


        for (int i = 1; i<=n ; i++) {
            for (int j = i; j <= n-1 ; j++) {
                System.out.print("  ");

            }
            int x =1;
            for(int j = 1; j <= i ; j++)
            {

                System.out.print(x+ "   ");
                x = x * (i-j)/j;
            }

            System.out.println();
        }
    }
}
