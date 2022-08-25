package NumberPrograms;

import java.util.Scanner;

public class PassOrFail {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter the 4 subject marks : ");

        double s1 = in.nextDouble();
        double s2 = in.nextDouble();
        double s3 = in.nextDouble();
        double s4 = in.nextDouble();

        if( s1< 35 || s2 < 35 || s3<35 || s4 < 35){
            System.out.println("student is fail");
        }else {
            System.out.println("Student is pass");
        }
    }
}
