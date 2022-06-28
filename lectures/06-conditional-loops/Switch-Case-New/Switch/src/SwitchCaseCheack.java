import java.util.Scanner;

public class SwitchCaseCheack {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch (fruit){
            case "Apple":
                System.out.println("Its a red fruit used in apple company");
                break;
            case "Mango":
                System.out.println("Its a king of fruit .");
                break;
            case "grapes":
                System.out.println("its a smallest fruit of all fruits");
                break;
            default:
                System.out.println("Enter the valid fruits");
        }

        // advanced switch case
        switch (fruit) {
            case "Apple" -> {
                // perform another taske aslo
                int a = 23;
                int b = 33;
                System.out.println(a + b);

                System.out.println("Its a red fruit used in apple company");
            }
            case "Mango" -> System.out.println("Its a king of fruit .");
            case "grapes" -> System.out.println("its a smallest fruit of all fruits");
            case "banana" -> System.out.println("its a yellow fruit hygenic fruit.");
            default -> System.out.println("Enter the valid fruits");
        }

        // weekdays
        int day = in.nextInt();

        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekdays");
            case 6, 7 -> System.out.println("Weekends");
        }


        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekdays");
                break;
            case 6:
            case 7:
                System.out.println("Weekends");
                break;
        }


    }
}
