package Patterns;

import java.util.Scanner;

public class advptr6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number of Lines");
        int n = in.nextInt();
        for (int i = 1; i<=n ; i++) {
            for (int j = 1; j <= i-1 ; j++) {
                System.out.print("  ");
            }
            int x = i;

            for(int j = 1; j <= 2*i-1 ; j++)
            {
                System.out.print(x+ "  ");
                if(j<i)
                    x++;
                else
                    x--;

            }

            System.out.println();
        }
    }
}
