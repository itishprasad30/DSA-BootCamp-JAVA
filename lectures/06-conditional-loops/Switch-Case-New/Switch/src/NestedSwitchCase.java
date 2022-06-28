import java.util.Scanner;

public class NestedSwitchCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empId = in.nextInt();
        String deptName = in.next();

        switch (empId){
            case 1 :
                System.out.println("The Weeknd");
                break;
            case 2 :
                System.out.println("Taylor Swift");
                break;
            case 3 :
                System.out.println("Itish Prasad Sahoo");
                switch (deptName){
                    case "IT" :
                        System.out.println("Department Name is IT");
                        break;
                    case "Maneger":
                        System.out.println("Mangerial round here.");
                        break;
                }
                break;
            default:
                System.out.println("Please enter the valid EmpId .");
        }



        // better way to switchcase
        switch (empId) {
            case 1 -> System.out.println("The Weeknd");
            case 2 -> System.out.println("Taylor Swift");
            case 3 -> {
                System.out.println("Emp is 3 ");
                switch (deptName) {
                    case "IT" -> System.out.println("Department Name is IT");
                    case "Maneger" -> System.out.println("Mangerial round here.");
                }
            }
            default -> System.out.println("Please enter the valid EmpId .");
        }
    }
}
