package Arrays;

import java.util.Arrays;

public class SortedTwoArray {
    public static void main(String[] args) {
        int [] a = {56,34,25,184};
        int[] b = {3,54,33,22,87};


        int []c = sortedArray(a);
        int []d = sortedArray(b);

        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.toString(d));

        int[] merged = mergeArray(c,d);
        int[] sortedArray = sortedArray(merged);
        System.out.println(Arrays.toString(sortedArray));
    }
    static int[] mergeArray(int[] x, int[] y) {
        int []c = new int[x.length + y.length];
        for (int i = 0; i < x.length; i++) {
            c[i] = x[i];

        }
        for (int i = 0; i < y.length; i++) {
            c[x.length + i] = y[i];

        }
        return c;
    }
     static int[] sortedArray(int[] a) {
         for (int i = 0; i < a.length; i++) {
             for (int j = i+1; j < a.length ; j++) {
                 if(a[i] > a[j]){
                     int temp = a[i];
                     a[i] = a[j];
                     a[j] = temp;
                 }

             }

         }
        return a;
    }
}
