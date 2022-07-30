import java.util.Scanner;

public class SmallestAmout {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double d = in.nextDouble();

        double res = (a<b && a < c && a< d ) ? a  : (b <c && b<d )? b : c<d ? c:d;
        System.out.println(res);
    }
}
