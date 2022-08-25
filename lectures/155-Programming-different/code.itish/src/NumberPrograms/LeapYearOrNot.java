package NumberPrograms;

import java.util.Scanner;

// Leap year -> divisable by 400 or not div by 100 and div by 4

public class LeapYearOrNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter the Year : ");

        int year = in.nextInt();

        if(year % 400 == 0 || ( year %100 !=0 && year % 4 == 0  )){
            System.out.println(year + " is a Leap year");
        }else {
            System.out.println(year + " is not a Leap Year");
        }


    }
}
