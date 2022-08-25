package NumberPrograms;

import java.util.Scanner;


// special 2 digit number -> sum of two digit and product of two digit is
// equals to same number
// 59 -> 5+9 = 14, 5* 9 = 45 ,
      // 14 + 45 = 54

public class Special2digit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter  number : ");
        int x = in.nextInt(); // 59
        // get first digit
        int d1 = x / 10;  // --> 5
        // get last digit
        int d2 = x % 10; // --> 9

        int sum = d1 + d2 + d1 * d2;
        if(sum == x)
            System.out.println(x + " is special 2 digit num");
        else
            System.out.println(x + " is not a special 2 digt num");

    }
}
