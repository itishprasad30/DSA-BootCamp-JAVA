package itish.generics;


import java.util.ArrayList;

public class LambdaFuntion {
    public static void main(String[] args) {
        Operation sum = (a,b) ->a+b;
        ArrayList arr = new ArrayList();
        arr.add(23);
        arr.add(25);
        arr.add(27);
//        arr.forEach((item)-> System.out.println(item*2));

    }
    interface Operation{
        int sum(int a,int b);
    }
}
