package Patterns;

import java.util.Scanner;
//Enter the lines Number:
//        5
//        *****
//         ****
//          ***
//           **
//            *

public class ptr23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the lines Number: ");
        int n = in.nextInt();

        for(int i=n;i>=1;i--){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
