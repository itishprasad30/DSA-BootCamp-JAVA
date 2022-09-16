package PraticeProgram;

import java.util.Scanner;

/*
    7
   *
  * *
 *   *
  * *
   *

 */
public class advptr1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int st = 1;
        int sp = n/2;

        for (int i = 1; i <=n ; i++) {

            // for the space printing
            for (int j = 1; j <= sp ; j++) {
                System.out.print(" ");
            }
            // for printing the actual *
            for (int j = 1; j <= st; j++) {
                if(j == 1 || j== st)
                    System.out.print("*");
                else
                    System.out.print(" ");

            }
            if(i<n/2){
                sp--;
                st= st+2;
            }
            else {
                sp++;
                st = st-2;
            }

            System.out.println();
        }
    }
}
