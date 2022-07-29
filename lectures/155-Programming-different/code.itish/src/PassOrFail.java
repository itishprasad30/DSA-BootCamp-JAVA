import java.util.Scanner;

public class PassOrFail {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter the 4 subject marks : ");

        double s1 = in.nextDouble();
        double s2 = in.nextDouble();
        double s3 = in.nextDouble();
        double s4 = in.nextDouble();

        System.out.println("Please enter the FullMark:");
        double total = in.nextDouble();
        double result = s1+ s2 + s3 + s4;

        if( result/total < 0.3){
            System.out.println("student is fail");
        }else {
            System.out.println("Student is pass");
        }
    }
}
