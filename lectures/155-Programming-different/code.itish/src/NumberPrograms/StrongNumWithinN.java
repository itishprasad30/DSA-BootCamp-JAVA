package NumberPrograms;

import java.util.Scanner;

public class StrongNumWithinN {
    // input : 10
    // out: between 10
    //Strong num: sum of factrial of indivisual digits equals to same number

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter the Range number: ");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            boolean res = isStrong(i);
           if(res == true){
               System.out.print(i + " ");
           }

        }


    }

    static boolean isStrong(int n){
        int sum=0;
        int temp = n;
        while (n!=0){
            int rem = n % 10;
            sum = sum+ fact(rem);
            n = n /10;

        }
        return sum == temp;
    }

    static int fact(int n){
        int fc =1;
        while (n>1){
            fc = fc * n;
            n--;
        }
        return fc;
    }
}
