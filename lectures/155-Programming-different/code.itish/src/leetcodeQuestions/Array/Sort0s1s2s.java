package leetcodeQuestions.Array;

import java.util.Arrays;

public class Sort0s1s2s {
    public static void main(String[] args) {
        int []arr = {0,0,2,2,1,1,0,0,2,1};
        sort012(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void sort012(int[] arr) {
        //Write your code here
        int zero = 0;

        int one = 0;

        int two = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 0) {

                zero++;

            } else if (arr[i] == 1) {

                one++;

            } else {

                two++;

            }

        }

        for (int i = 0; i < zero; i++) {

            arr[i] = 0;

        }

        for (int i = zero; i < zero + one; i++) {

            arr[i] = 1;

        }

        for (int i = zero + one; i < zero + one + two; i++) {

            arr[i] = 2;

        }
    }
}
