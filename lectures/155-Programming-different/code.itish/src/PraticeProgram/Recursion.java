package PraticeProgram;

public class Recursion {
     static  int func(int n){
        int res;
        if(n== 1){
            return 1;
        }

        res = func(n-1);
        return res;
    }

    public static void main(String[] args) {
        System.out.println(func(5));
    }
}
