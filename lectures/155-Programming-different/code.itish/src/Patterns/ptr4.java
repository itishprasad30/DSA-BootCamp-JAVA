package Patterns;

import java.util.Scanner;
//        n = 5


//        1 2 3 4 5
//        2 3 4 5
//        3 4 5
//        4 5
//        5
public class ptr4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the lines Number: ");
        int n = in.nextInt();

        for(int i=1;i<=n;i++){
            for (int j=i;j<=n;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
