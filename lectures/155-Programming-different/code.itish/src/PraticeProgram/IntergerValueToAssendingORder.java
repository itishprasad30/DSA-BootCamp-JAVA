package PraticeProgram;

import java.util.Scanner;
// WAP user enter interger value to convert it into accending order

// in =  91452
// out = 12459
public class IntergerValueToAssendingORder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        accending(n);
    }

    private static void accending(int n) {
        int num = n;
        for (int i = 0; i <=9 ; i++) {
            while (n!=0){
                int d = n% 10;
                if(d == i){
                    System.out.print(d);
                }
                n = n/10;
            }
            n = num;

        }
    }
}
