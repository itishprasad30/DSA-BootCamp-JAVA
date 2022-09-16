package Arrays.TwodimensionArrays;

public class addMatrix {

    public static void main(String[] args) {
        Matrix mt = new Matrix();
        System.out.println("Enter the first matrix :");
        int [][] x = mt.readMat();
        System.out.println("Enter the second matrix :");
        int [][] y = mt.readMat();
        System.out.println("Display 1 st matrix is : ");
        mt.displayMat(x);
        System.out.println("Display 2nd matrix is : ");
        mt.displayMat(y);

        System.out.println("After adding two matrix");
        int added [][] = mt.addMat(x,y);
        mt.displayMat(added);




    }
}
