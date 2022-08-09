import java.util.Scanner;

public class AvgOfDigits {
    static int countDigit(int x){
        int count = 0;
        do {
            x= x/10;
            count++;
        }while (x !=0);
        return count;
    }

    static int avgOfDigits(int n){
        int digitCount = countDigit(n);
        int sum =0;

        while (n> 0){
            int r = n %10;
            sum = sum + r;
            n/=10;
        }
        int avg = sum /digitCount;
        return avg;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the digits: ");
        int n = in.nextInt();
        int res = avgOfDigits(n);
        System.out.println(res);
    }


}
