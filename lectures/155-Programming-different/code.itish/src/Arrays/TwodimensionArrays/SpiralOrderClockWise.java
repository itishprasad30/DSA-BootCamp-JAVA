package Arrays.TwodimensionArrays;

public class SpiralOrderClockWise {
    public static void main(String[] args) {
        Matrix mt = new Matrix();
        System.out.println("Enter the first matrix : ");
        int [][] mat = mt.readMat();
        printSpiralOrder(mat);
        printSpiralOrderAnti(mat);


    }

    //Clock wise
    private static void printSpiralOrder(int[][] mat) {
        int n = mat.length;

        for(int i=0,j=n-1 ; i<j ; i++,j--){
            for (int k = i; k < j ; k++)
                System.out.print(mat[i][k] + " ");
            for (int k = i; k <j ; k++)
                System.out.print(mat[k][j] + " ");
            for (int k =j ; k> i ; k--)
                System.out.print(mat[j][k] + " ");
            for(int k =j ; k> i ;k--)
                System.out.print(mat[k][i] + " ");
        }
        if(n %2 == 1)
            System.out.print(mat[n/2][n/2] +" \n");
    }
    // anitClock wise
    private static void printSpiralOrderAnti(int[][] mat) {
        int n = mat.length;

        for(int i=0,j=n-1 ; i<j ; i++,j--){
            for (int k = i; k < j ; k++)
                System.out.print(mat[k][i] + " ");
            for (int k = i; k <j ; k++)
                System.out.print(mat[j][k] + " ");
            for (int k =j ; k> i ; k--)
                System.out.print(mat[k][j] + " ");
            for(int k =j ; k> i ;k--)
                System.out.print(mat[i][k] + " ");
        }
        if(n %2 == 1)
            System.out.println(mat[n/2][n/2]);
    }
}
