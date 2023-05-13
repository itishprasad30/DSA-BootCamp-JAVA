package Demo1;

public class Interface_Ex implements Printable,Showable{


    @Override
    public void print() {
        System.out.println("Print method");
    }


    public static void main(String[] args) {
        Showable ii = new Interface_Ex();
        ii.print();
        ii.hello();
        Showable.hm();
        String[] arr = {"some","value"};
        Showable.main(arr);

    }
}
