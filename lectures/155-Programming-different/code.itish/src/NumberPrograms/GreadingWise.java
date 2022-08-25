package NumberPrograms;

import java.util.Scanner;

public class GreadingWise {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter the 4 subject marks : ");

        double s1 = in.nextDouble();
        double s2 = in.nextDouble();
        double s3 = in.nextDouble();
        double s4 = in.nextDouble();

        if(s1 >=85 && s2 >= 85 && s3 >= 85 && s4 >= 85){
            System.out.println("Distraction");
        } else if (s1 >= 60 && s2 >=  60 && s3 >= 60 && s4 >= 60) {
            System.out.println("First Class ");
        } else if (s1 >= 45 && s2 >= 45 && s3 >=45  && s4 >= 45) {
            System.out.println("Second class");
        } else if (s1<35 && s2< 35 && s3 < 35 && s4< 35) {
            System.out.println("Fail");

        }
        else {
            System.out.println("Pass");
        }

    }
    }
