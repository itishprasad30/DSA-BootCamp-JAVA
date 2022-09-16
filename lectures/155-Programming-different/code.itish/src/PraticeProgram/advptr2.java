package PraticeProgram;

import java.util.Scanner;
/*
Enter the Number :
3
1           1
1  2     2  1
1  2  3  2  1
 */
public class advptr2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = in.nextInt();
        int st = 2*n -1;

        for (int i = 1; i <=n ; i++) {
            int x =1;
            for (int j = 1; j <= st ; j++) {
                if(x> i){
                    System.out.print("   ");
                }
                else {
                    System.out.print(x + "  ");
                }
                if(j<=st/2){
                    x++;
                }else {
                    x--;
                }
            }


            System.out.println();
        }
    }
}
