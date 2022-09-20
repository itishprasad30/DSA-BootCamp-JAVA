package Arrays.TwodimensionArrays;


/*
Enter the first matrix :
Enter the no. of Rows and Cols
3 2
Enter the all the 6 elements in the rows wise :
2 3 6 7 9 4
Enter the second matrix :
Enter the no. of Rows and Cols
2 3
Enter the all the 6 elements in the rows wise :
5 6 7 2 3 4
16 21 26
44 57 70
53 66 79
 */
public class multiplyTwoMatrix {

    public static void main(String[] args) {
        Matrix mt = new Matrix();
        System.out.println("Enter the first matrix : ");
        int [][] a = mt.readMat();
        System.out.println("Enter the second matrix : ");
        int [][] b = mt.readMat();

        int [][]multiply =multiply(a,b);
        mt.displayMat(multiply);


    }
    static  int[][] multiply(int[][]a ,int[][]b){
        if(a.length != b[0].length || a[0].length != b.length ){
            System.out.println("Not possible");
            return null;
        }

        int[][] c = new int[a.length][b[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < b.length; k++) {
                    c[i][j] = c[i][j] + a[i][k] * b[k][j];
                }
            }
        }
        return c;
    }
}
