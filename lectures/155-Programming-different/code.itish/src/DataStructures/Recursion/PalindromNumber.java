package DataStructures.Recursion;

import java.util.Scanner;

public class PalindromNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //546
        System.out.println(isPalindrom(n));
    }
    static boolean isPalindrom(int n){
        return isPalindrom(n,0,n);
    }
    static boolean isPalindrom(int n ,int rev,int temp){
        if(n==0)
            return rev == temp;
        return isPalindrom(n/10,rev*10 + n%10,temp);
    }
}
