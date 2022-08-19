package Arrays;

public class EvenAndOddInArr {
    public static void main(String[] args) {
        int [] arr = {2,3,4,5,6,7,8};
        int e=0,o=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 ==0)
                e++;
            else
                o++;
        }

        System.out.println("Even No present in array is : "+ e);
        System.out.println("Odd No present in array is : "+ o);
    }
}
