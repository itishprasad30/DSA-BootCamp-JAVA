package PraticeProgram;

import java.util.Arrays;

public class CopyArray {

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        //System.arraycopy(arr);
       int []a = Arrays.copyOf(arr,5);
        System.out.println(Arrays.toString(a));

    }
}
