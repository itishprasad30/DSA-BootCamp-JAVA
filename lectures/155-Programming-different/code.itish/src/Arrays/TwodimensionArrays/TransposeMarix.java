package Arrays.TwodimensionArrays;

import java.util.Scanner;

public class TransposeMarix {
    public static void main(String[] args) {
        Matrix m = new Matrix();
        int [][]x = m.readMat();

        m.displayMat(x);

        int big = m.bigEle(x);
        System.out.println("The biggest element is "+ big);
        System.out.println("The smallest  element is "+ m.smallEle(x));

        int [] eo = m.evenOdd(x);
        System.out.println("the even no is : "+ eo[0] + " \n the odd no is "+ eo[1]);

    }

}
