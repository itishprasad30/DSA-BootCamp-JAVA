package NumberPrograms;

import java.util.Scanner;

public class NegetiveOrPositive {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.println("Please Enter the Number :");
        int x = in.nextInt();

        // check the logic
        if(x < 0)
            System.out.println(x + " is negetive number .");
        else
            System.out.println(x + " is Positve number . ");
    }
}
