package Arrays.TwodimensionArrays;

import java.util.Arrays;

public class RowWiseBiggest {
    public static void main(String[] args) {
        Matrix mt = new Matrix();
        int [][] x = mt.readMat();
        System.out.println("Display the Matrix is :");
        mt.displayMat(x);

        int [] row = maxRow(x);
        System.out.println("big from row wise");
        System.out.println(Arrays.toString(row));
        System.out.println("big from col wise ");
        int [] col = maxCol(x);
        System.out.println(Arrays.toString(col));
//        int [] dia = maxDia(x);
//        System.out.println(Arrays.toString(dia));
//

        System.out.println("Row Revese is :");
       int [][]revRow = rowRev(x);
       mt.displayMat(revRow);

        System.out.println("Col rev is : ");
        int [][] revCol = colRev(x);
        mt.displayMat(revCol);

    }

    public static int[] maxDia(int[][]  mat) {
        int max = 0;
        int[] result = new int[mat.length-1];

        for(int i =0;i< mat.length ;i++)           {
            for (int j = 0; j < mat[i].length; j++) {
                if(i==j ){
                    if (mat[i][j] > max) {
                        max = mat[i][j];
                    }
                }
                result[i] = max;
                max = 0;

            }


        }
        return result;
    }


    public static int[] maxRow(int mat[][]) {

        int max = 0;
        int[] result = new int[mat.length];
          for(int i =0;i< mat.length ;i++)           {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] > max) {
                    max = mat[i][j];
                }
            }
            result[i] = max;
            max = 0;

        }
        return result;

    }
    public static int[] maxCol(int mat[][]) {

        int max = 0;
        int[] result = new int[mat[0].length];
        for(int i =0;i< mat.length ;i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[j][i] > max) {
                    max = mat[j][i];
                }
            result[i] = max;
            max = 0;
            }

        }
        return result;

    }

    public  static int[][] rowRev(int [][]mat ){
        int [][]res = new int[mat.length][mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                res[i][mat[i].length-j-1] = mat[i][j];
            }
        }
        return res;
    }
    public  static int[][] colRev(int [][]mat ){
        int [][]res = new int[mat.length][mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
             res[i][j] =  mat[mat[i].length-j-1][i];
            }
        }
        return res;
    }


}
