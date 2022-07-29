import java.util.Scanner;

public class Print3numInASE {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many Element to enter in Array");
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int c = in.nextInt();
        int n = in.nextInt();
        // created array from your input
        int []a = new int[n];

        // loop thorough all the single element each element
        System.out.println("Enter the all the element : ");
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();

        }
        // actually swaping the array element if the first element is greater than 2nd one

        for (int i = 0; i < n; i++) {
            for (int j = i +1 ; j < n; j++) {
                if(a[i] > a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }

            }

        }

        System.out.println("Asscending order : ");
        for (int i = 0; i < n-1; i++) {
            System.out.print(a[i] + ",");

        }
        System.out.println(a[n-1]);
    }
}
