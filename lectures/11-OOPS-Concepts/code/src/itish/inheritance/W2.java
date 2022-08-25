package itish.inheritance;

public class W2 extends W1{
    int age;
    W2(String name,long cno,int age){
        super(name,cno);
        this.age = age;
    }

    protected void sum(){
        System.out.println("sum of b is ");
    }

    public static void main(String[] args) {
        W2 w = new W2("whatapp",32234442,22);
        System.out.println(w.age); // 22
        System.out.println(w.name); // whatapp
        System.out.println(w.cno);  //  32234442
    }
}
