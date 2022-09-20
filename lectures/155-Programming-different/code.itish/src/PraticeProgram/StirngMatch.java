package PraticeProgram;

import java.util.Arrays;
import java.util.Scanner;

public class StirngMatch {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String st =in.nextLine();
        System.out.println("Enter the target Element");
        String target = in.next();

        int res = matChString(st,target);
        System.out.println(res);

    }
    static int matChString(String st ,String target){
        if(st.contains(target)){
            return 1;
        }
       return -1;
    }
}
