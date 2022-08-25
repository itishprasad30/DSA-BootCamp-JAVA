package Arrays;

public class nthSmallestElement {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6};
        int small = nthSmallestElement(arr,3);
        System.out.println(small);
    }
    static int nthSmallestElement(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            int count=0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[j] < arr[i])
                    count++;
            }
            if(count == n-1)
                return arr[i];

        }
        System.out.println("Smallest Element not Here");
        return 0;
    }
}
