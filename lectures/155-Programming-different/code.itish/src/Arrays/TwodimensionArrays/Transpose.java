package Arrays.TwodimensionArrays;

public class Transpose {
    public static void main(String[] args) {
        Matrix m = new Matrix();
        int [][]x = m.readMat();
        System.out.println("Display the matrix");
        m.displayMat(x);

        x = m.transpose(x);
        System.out.println("After transpose");
        m.displayMat(x);
    }
}
