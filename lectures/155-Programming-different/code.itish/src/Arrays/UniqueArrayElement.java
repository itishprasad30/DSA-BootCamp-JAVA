package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueArrayElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Size of Array ");
        int n = in.nextInt();

        int [] arr = new int[n];
        System.out.println("Enter the Array Elements ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        int [] x = new int[n];

        int k = 0;
        for (int i = 0; i < n; i++) {
            int flag = 0 ;
            for (int j = i + 1; j < n; j++) {
                if(arr[i] == arr[j])
                    flag=1;
            }
            if(flag == 0){
                x [k] = arr[i];
                k++;
            }
        }

        for (int i = 0; i < k; i++) {
            System.out.print(x[i] + " ");

        }
    }
}
