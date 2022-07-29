import java.util.Scanner;

public class Print3numInASE {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter the 3 numbers");
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int c = in.nextInt();
        int n = in.nextInt();
        int []a = new int[n];
        System.out.println("Enter the all the element : ");
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();

        }

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
