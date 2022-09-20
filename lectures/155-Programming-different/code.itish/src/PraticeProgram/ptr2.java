package PraticeProgram;

import java.util.Scanner;
/*
          4
        1234321
        123 321
        12   21
        1     1
 */
public class ptr2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = in.nextInt();
        int a =n;
        int b= n;

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j < n*2 ; j++) {
                if(j<=a)
                    System.out.print(j);
                else if (j>=b) {
                    System.out.print((n*2) -j);

                }
                else {
                    System.out.print(" ");
                }

            }
            System.out.println();
            a--;
            b++;
        }
    }
}
