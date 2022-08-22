package Arrays;

public class CoprimeFind {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};

        for (int i = 0; i < arr.length -1; i++) {
            boolean x = checkPrime(arr[i]);
            boolean y = checkPrime(arr[i+1]);
            if(x == y )
                System.out.println(arr[i] + " ," + arr[i+1]);


        }
    }

    private static boolean checkPrime(int n) {

        for (int j = 2; j <= n/2 ; j++) {
            if (n % j == 0)
                return false;
        }
            return true;
        }
    }


