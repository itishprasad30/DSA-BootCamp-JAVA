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


    }
}
