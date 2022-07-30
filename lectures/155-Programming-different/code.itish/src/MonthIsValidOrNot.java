import java.util.Scanner;

public class MonthIsValidOrNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
//        if(m<1 || m > 12)
//            System.out.println("Invald");
//        else
//            System.out.println("Valid");

        if(m>0 && m<13)
            System.out.println("Valid");

        else
            System.out.println("Invalid");

    }
}
