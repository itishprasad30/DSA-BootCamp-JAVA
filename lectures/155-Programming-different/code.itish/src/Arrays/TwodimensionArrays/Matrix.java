package Arrays.TwodimensionArrays;

import java.util.Scanner;

public class Matrix {
   int [][]   readMat(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no. of Rows and Cols");
        int row = in.nextInt();
        int col = in.nextInt();
        int[][] arr = new int[row][col];
        System.out.println("Enter the all the " + row*col+ " elements in the rows wise : ");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextInt();

            }
        }
        return arr;
    }


    public void displayMat(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");

            }
            System.out.println();
        }
    }

    public int bigEle(int[][] mat) {
       int big = mat[0][0];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if(mat[i][j] > big)
                    big = mat[i][j];

            }
        }
        return big;

    }

    public int smallEle(int[][] mat) {
        int small = mat[0][0];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if(mat[i][j] <small)
                    small = mat[i][j];

            }
        }
        return small;
    }
    // how many even odd present in the matrix
    public int[] evenOdd(int[][] mat) {
       int es=0,os=0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
               if(mat[i][j] % 2 ==0){
                   es++;
               }else {
                   os++;
               }

            }
        }
        return new int[]{es,os};
    }

    // transpose the Matrix
    public int[][] transpose(int[][] mat){
       int [][] tra = new int[mat[0].length][mat.length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {

                tra[j][i] = mat[i][j];
            }
        }

       return tra;
    }

    // adding the two matrix
    public  int[][] addMat(int[][]x,int[][]y){
       if(x.length != y.length || x[0].length != y[0].length){
           System.out.println("Order must be same");
           return null;
       }
        int [][]z = new int[x.length][x[0].length];
        for (int i = 0; i < z.length; i++) {
            for (int j = 0; j < z[i].length; j++) {
                z[i][j] = x[i][j]+ y[i][j];

            }
        }
        return z;
    }
    // Row wise big
    public int[] rowWiseBig(int [][]mat) {
        int[] big = new int[mat.length];
        for (int i = 0; i < mat.length; i++) {
            int bg = mat[i][0];
            for (int j = 0; j < mat[i].length; j++) {
                if(mat[i][j]> bg){
                    bg= mat[i][j];
                }
                big[i] = bg;
            }
        }
        return big;
    }

    // Column wise bigeset element
    public int[] coLWiseBig(int [][]mat) {
        int[] big = new int[mat[0].length];

        for (int i = 0; i < mat[0].length; i++) {
            int bg = mat[0][i];
            for (int j = 1; j < mat.length; j++) {
                if(mat[j][i]> bg){
                    bg= mat[j][i];
                }
                big[i] = bg;
            }
        }
        return big;
    }

    // Row wise reverse the element
    public  void  rowWiseRev(int[][]mat){
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length / 2; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[i][mat.length -1 -j];
                mat[i][mat.length -1 -j] = temp;
            }
        }
    }

    // Column wise reverse the element

    public  void  colWiseRev(int[][]mat){
        for (int i = 0; i < mat.length/2; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[mat.length-1-i][j];
                mat[mat.length-1][j] = temp;
            }
        }
    }

    // Diagonal wise revese the elements

    public  void diagonalRev (int[][]mat){
        for (int i = 0; i < mat.length/2; i++) {
            int temp = mat[i][i];
            mat[i][i] = mat[mat.length -1 -i][mat.length -1 -i];
            mat[mat.length -1 -i][mat.length -1 -i] = temp;

            temp = mat[i][mat.length -1 -i];
            mat[i][mat.length -1 -i] = mat[mat.length -1 -i][i];
            mat[mat.length -1 -i][i] = temp;
        }

   }

   // Find diagoal wise big element
   int[] diagoanalBig (int[][]mat){
       int pBig = mat[0][0];
       int sBig = mat[0][mat.length -1];

       for (int i = 0; i < mat.length; i++) {
           if(mat[i][i] > pBig){
               pBig = mat[i][i];

           }
           if(mat[i][mat.length-1 - i] > sBig){
               sBig = mat[i][mat.length-1 - i];
           }
       }
       return new int[]{pBig,sBig};
   }

   // Rotate Left 90^0
   int[][] rotate90degLeft(int[][]mat){
       mat = transpose(mat);
       colWiseRev(mat);
       return mat;
   }
   // Rotate Right 90^0

   int[][] rotate90degRight(int [][]mat){
       mat = transpose(mat);
       rowWiseRev(mat);
       return mat;
   }


}
