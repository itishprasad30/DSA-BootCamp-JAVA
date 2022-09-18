package DataStructures.Recursion;

import java.util.Scanner;

public class SumOfDigitProductOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("sum of Digits is : ");
        System.out.println(sumOfDigits(n));
        System.out.print("Products of Digits is : ");
        System.out.println(productsOfDigits(n));

    }

    private static int productsOfDigits(int n) {
        if(n<10)
            return n;
        return n%10 * productsOfDigits(n/10);
    }

    static int sumOfDigits(int n) {
        if(n==0)
            return 0;
        return n%10+ sumOfDigits(n/10);
    }
}
