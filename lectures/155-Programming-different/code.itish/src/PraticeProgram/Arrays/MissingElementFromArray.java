package PraticeProgram.Arrays;

public class MissingElementFromArray {
    public static void main(String[] args) {
        int []arr = {4,5,6,7,8};

        int []count = new int [10];

        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[j] == i)
                    count[i]++;
            }
        }
        for (int i = 0; i < count.length; i++) {
            if(count[i] == 0)
                System.out.println(i);
        }

    }
}
