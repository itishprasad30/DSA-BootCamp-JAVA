import java.util.Scanner;

public class HowManyDaysInMonth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter the month number :");
        int month = in.nextInt();

        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(month+ " This have 31 days in the month.");
                break;
            case 2:
                System.out.println(month +  " THis have 28 days in the month");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(month + " This have 30 days in the month");
                break;
        }

        // advance switch case
//        switch (month) {
//            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println(month + " This have 31 days in the month.");
//            case 2 -> System.out.println(month + " THis have 28 days in the month");
//            case 4, 6, 9, 11 -> System.out.println(month + " This have 30 days in the month");
//        }
    }
}
