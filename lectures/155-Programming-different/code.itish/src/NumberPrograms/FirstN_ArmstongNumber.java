package NumberPrograms;

import java.util.Scanner;

public class FirstN_ArmstongNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter nos to armstrong Num: ");
        int n = in.nextInt();
        for (int i = 1; n> 0 ; i++) {
            boolean res = isArmstrong(i);
            if(res){
                System.out.print(i + " ");
                n--;
            }

        }
//
    }

    static boolean isArmstrong(int n) {
        int temp = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum = sum + rem * rem * rem;
            n = n / 10;
        }
        return temp == sum;
    }

//     static boolean isArmstrong(int n) {
//        int dc = countDigit(n);
//        int temp = n;
//        int sum = 0;
//        while (n> 0){
//            int rem = n % 10;
//            sum = sum + pow(rem,dc);
//            n = n/10;
//        }
//        return  sum == temp;
//    }
//
//    static int pow(int n,int p){
//        int pw = 1;
//        while (p>0){
//            pw = pw* n;
//            p--;
//        }
//        return pw;
//    }
//    static int countDigit(int n){
//        int count =0;
//        do {
//            n = n/10;
//            count++;
//
//        }while (n!=0);
//        return count;
//    }
}
