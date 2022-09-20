package PraticeProgram;
import java.util.Scanner;
public class coin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
       int a=0,b=0,c=0;

        if (n > 25) {
            n = n - 25;
            a = a + 5;
        } else {
            a = n / 5;
            n = n % 5;
        }
        if (n > 10) {
            n = n - 10;
            b = b + 5;
        } else {
            b = n / 2;
            n = n % 2;
        }
        if (n <= 5) {
            c = n;
        }

        else
            System.out.println("Invalid");
        sum = a + b + c;
        System.out.println(sum);
    }
}








