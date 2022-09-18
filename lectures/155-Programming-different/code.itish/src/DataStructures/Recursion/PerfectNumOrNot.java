package DataStructures.Recursion;

import java.util.Scanner;

public class PerfectNumOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean res = isPerfect(n);
        if(res)
            System.out.println(n +" is Perfect number ");
        else
            System.out.println(n + " is not a Perfect Number");

    }

     static boolean isPerfect(int n) {
        return isPerfect(n,1,0);
    }
    static boolean isPerfect(int n,int i,int sum){
        if(i> n/2)
            return sum==n;
        if(n%i==0)
             sum = sum+i;

        return isPerfect(n,i+1,sum);
    }
}
