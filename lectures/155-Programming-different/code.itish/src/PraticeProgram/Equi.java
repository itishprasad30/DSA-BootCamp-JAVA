package PraticeProgram;

public class Equi {
    public static void main(String[] args)
    {

        int arr[] = {1,2,3,4,3,3};


        int result = equi(arr);
        if(result == -1){
            System.out.println("No equbrium element found");
        }else
            System.out.println(result);
    }
    static  int equi(int arr[])
    {
        int sum = 0; // initialize sum of whole array
        int leftsum = 0; // initialize leftsum

        /* Find sum of the whole array */
        for (int i = 0; i < arr.length; ++i)
            sum += arr[i];

        for (int i = 0; i < arr.length; ++i) {
            sum -= arr[i]; // sum is now right sum for index
            // i

            if (leftsum == sum)
                return i+1;

            leftsum += arr[i];
        }

        /* If no equilibrium index found, then return 0 */
        return -1;
    }


}
