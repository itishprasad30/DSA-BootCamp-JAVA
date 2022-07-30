import java.util.Scanner;

public class Print3numInASE {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many Element to enter in Array");
        System.out.println("Enter 3 number");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        // simple way
        int big =  a > b && a> c ? a: b>c ? b:c;
        int small = a< b && a <c ? a : b<c ? b : c;

        System.out.println(small);
        System.out.println( (a+b + c) - (big +small));
        System.out.println(big);



        int n = in.nextInt();
        // created array from your input
        int []arr = new int[n];

        // loop thorough all the single element each element
        System.out.println("Enter the all the element : ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();

        }
        // actually swaping the array element if the first element is greater than 2nd one

        for (int i = 0; i < n; i++) {
            for (int j = i +1 ; j < n; j++) {
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }

        }

        System.out.println("Asscending order : ");
        for (int i = 0; i < n-1; i++) {
            System.out.print(arr[i] + ",");

        }
        System.out.println(arr[n-1]);
    }
}
