package leetcodeQuestions.TopInterviewLevelQuestion;

public class SearchInMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int target = 77;

        boolean res = searchMatrix(matrix,target);
        if(res)
            System.out.println("Target element found");
        else
            System.out.println("Not found");
    }
    static boolean searchMatrix(int [][]matrix,int target){
        int row  = matrix.length;
        int col = matrix[0].length;

        int start =0;
        int end = (row*col)-1;

        while (start<=end){
            int mid = start+ (end-start)/2;

            if(matrix[mid/col][mid%col] == target)
                return true;
            else if (matrix[mid/col][mid%col] < target) {
                start=mid+1;
            }else {
                end = mid-1;
            }
        }
        return false;
    }
}
