package Arrays;

import java.util.Scanner;

public class HighestLengthName {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array : ");

        int size = in.nextInt();
        System.out.println("Enter the array elements: ");
        String[] name = new String[size];

        for (int i = 1; i < name.length; i++) {
            name[i] = in.next();

        }
        String big = getHighchar(name);
        System.out.println("Highest length of name is " + big.length());
    }
    static String getHighchar(String []name){
        String big = name[0];
        for (int i = 0; i < name.length; i++) {

            if (name[i].length() > big.length())
                big = name[i];
        }
//        for (String s : name) {
//            if (s.length() > big.length())
//                big = s;
//        }
        return big;
    }
}
