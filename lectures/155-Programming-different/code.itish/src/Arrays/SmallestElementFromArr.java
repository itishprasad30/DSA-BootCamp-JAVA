package Arrays;

public class SmallestElementFromArr {
    public static void main(String[] args) {
        int []arr = {113,243,35,44,57};

        int small = smallElement(arr);
        System.out.println("Smallest Element from array is : " + small);

    }

    private static int smallElement(int[] arr) {
        int small = arr[0];
        for (int j : arr) {

            if (j < small)
                small = j;


        }
        return small;
    }

}
