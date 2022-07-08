public class MinFromArray {
    public static void main(String[] args) {
        int[] arr = {32,1,24,67,-4,678};

        int minVal = minvalue(arr);
        System.out.println("The Min Value is : " + minVal);
    }

    private static int minvalue(int[] arr) {
        int ans= arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
