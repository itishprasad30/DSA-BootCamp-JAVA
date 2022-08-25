package Arrays;

public class nthBiggestElement {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6};
        int big = nthBigElement(arr,4);
        System.out.println(big);
    }

    static int nthBigElement(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            int count=0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[j] > arr[i])
                    count++;
            }
            if(count == n-1)
                return arr[i];

        }
        System.out.println("biggest Element not Here");
        return 0;
    }
}
