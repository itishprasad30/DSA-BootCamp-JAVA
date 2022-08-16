package Patterns.Mirrors;

import java.util.Scanner;
//
//Enter the Number of Lines
//        7
//        * * * * * * *  i = 1
//          * * * * *        2
//            * * *          3
//              *            4
//            * * *          5
//          * * * * *        6
//        * * * * * * *      7
public class ptr2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number of Lines");
        int n = in.nextInt();

        int sp = 0, st = n;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print("  ");

            }

            for (int j = 1; j <= st; j++) {

                System.out.print("* ");
            }
            if (i <= n / 2) {
                sp++;
                st = st - 2;
            } else {
                sp--;
                st = st + 2;
            }


            System.out.println();
        }
    }
}
