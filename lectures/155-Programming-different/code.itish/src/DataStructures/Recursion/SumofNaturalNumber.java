package DataStructures.Recursion;

public class SumofNaturalNumber {
    public static void main(String[] args) {
        int sum = sumOfnaturalNum(5);
        System.out.println("sum of the elements are : " + sum);
    }
    static int sumOfnaturalNum(int n){
        if(n==0){
            return 0;
        }
        return n+ sumOfnaturalNum(n-1);
    }
}
