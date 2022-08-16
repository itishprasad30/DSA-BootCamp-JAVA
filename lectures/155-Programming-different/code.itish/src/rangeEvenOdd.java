import java.util.Scanner;

public class rangeEvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int e= in.nextInt();

        evenOdd(s,e);
    }

    static void evenOdd(int s,int e){
        for (int i = s; i <= e ; i++) {
            if(i%2==0){
                System.out.println(i+" is even no.");
            }else {
                System.out.println(i+" is odd no.");
            }

        }
    }
}
