package NumberPrograms;

import java.util.Scanner;

public class factorialOfNumber {
    static int fact(int n){
        int fact = 1;
        while (n > 1){
            fact = fact * n;
            n--;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        System.out.println(fact(num));
    }
}
