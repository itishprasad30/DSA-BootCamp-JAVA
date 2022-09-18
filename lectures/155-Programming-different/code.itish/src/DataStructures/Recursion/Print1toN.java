package DataStructures.Recursion;

public class Print1toN {
    public static void main(String[] args) {
        display(5);
    }
    static void display(int n){
        if(n >1){
            display(n-1);

        }
        System.out.println(n);
    }
}
