package leetcodeQuestions.LinkedList;

import java.util.*;
class Main{
    public static void maxelement(int no_of_rows, int[][] arr) {
        int i = 0;
        int max = 0;
        int[] result = new int[no_of_rows];
        while (i < no_of_rows) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
            result[i] = max;
            max =0;
            i++;
        }
        printArray(result);
    }
    private static void printArray(int[] result) {
        for (int i =0; i<result.length;i++) {
            System.out.print(result[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        maxelement(row, arr);
    }
}