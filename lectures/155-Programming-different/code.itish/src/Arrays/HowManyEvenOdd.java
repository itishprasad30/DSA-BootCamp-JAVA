package Arrays;

public class HowManyEvenOdd {
    public static void main(String[] args) {
        int []a = {1,2,3,4,5,6};
        int pc = countEvenOdd(a);
        System.out.println(pc);

    }
    static int countEvenOdd(int [] arr){
        int e=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 ==0)
                e++;
            else
                e++;
        }

        return e;


    }
}
