package itish.inheritance;

public class W1 {
    String name;
    long cno;
    W1(String name,long cno){
        this.name = name;
        this.cno = cno;
    }

    protected void sum(){
        System.out.println("sum is a+b");
    }
}
