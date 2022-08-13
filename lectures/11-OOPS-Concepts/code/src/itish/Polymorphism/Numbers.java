package itish.Polymorphism;

public class Numbers {

    int sum (int a,int b){
        return a+b;
    }
    void sum (String a,double b){
        System.out.println(a+ b);
    }
    int sum (int a,int b,int c){
        return a+b+c;
    }
    int sum(int a,int b,int c,int d){
        return a+b+c+d;
    }

    public static void main(String[] args) {
        Numbers obj = new Numbers();
        int res = obj.sum(2,3,4);
        System.out.println(res);
        obj.sum("hello",2.34);

    }
}
