import java.util.Scanner;

public class GreadingWise {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter the 4 subject marks : ");

        double s1 = in.nextDouble();
        double s2 = in.nextDouble();
        double s3 = in.nextDouble();
        double s4 = in.nextDouble();

        if( s1< 35 || s2 < 35 || s3<35 || s4 < 35){
            System.out.println("student is fail");
        }
       else if (s1 > 85 || s2 > 85 || s3 > 85 || s4 > 85) {
            System.out.println("Distictions");

        } else if (s1 > 60 && s1 <85) {
            System.out.println("First class");

        } else if(s1 > 35 && s1 < 50){
            System.out.println("Second class");
        }
       else
            System.out.println("Pass");
    }
}
