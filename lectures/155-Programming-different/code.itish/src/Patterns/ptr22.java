package Patterns;

import java.util.Scanner;
//Enter the lines Number:
//        5
//         *
//        ***
//       *****
//      *******
//     *********

public class ptr22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the lines Number: ");
        int n = in.nextInt();

        for(int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i -1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
