package Patterns;

import java.util.Scanner;

//Enter the Number of Lines
//        5
//          1
//        2 3 4
//      5 6 7 8 9
//    1 2 3 4 5 6 7
//   8 9 1 2 3 4 5 6 7

public class advptr5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number of Lines");
        int n = in.nextInt();
        int x =1;

        for (int i = 1; i<=n ; i++) {
            for (int j = i; j <= n-1 ; j++) {
                System.out.print("  ");

            }
            for(int j = 1; j <= (2 * i - 1); j++)
            {

                System.out.print(x+ " ");
                x++;
                if(x==10)
                    x=1;



            }

            System.out.println();
        }
    }
}
