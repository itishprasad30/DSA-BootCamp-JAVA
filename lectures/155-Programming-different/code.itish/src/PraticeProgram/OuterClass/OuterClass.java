package PraticeProgram.OuterClass;

public class OuterClass {
    private String name ="Itish Prasad";
    private void m1(){
        System.out.println("Outer method m1 ()"+ name);
    }

    class Inner extends OuterClass{
        private void m1(){
            System.out.println("Inner method " + name);
        }
    }

    public static void main(String[] args) {
        OuterClass o = new OuterClass();
        Inner i = o.new Inner();

        i.m1();
        o.m1();
    }


}
