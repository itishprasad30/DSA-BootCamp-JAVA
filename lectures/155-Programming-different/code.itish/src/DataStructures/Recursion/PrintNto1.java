package DataStructures.Recursion;

public class PrintNto1 {
    public static void main(String[] args) {
        display(5);
    }

    // this is forward tracking
    //Recurison -> the method calling itself .
    // you have put a condition other wise it will show stackoverflow error.

    static void display(int n){
        System.out.println(n);
        if(n >1){
            display(n-1);
        }
    }
}
