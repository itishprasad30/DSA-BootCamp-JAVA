package itish.inheritance;

public class Main {


    public static void main(String[] args) {
        Box box1 = new Box(4.5,58.5,45);
        Box box2 = new Box(box1);



        // Box.greetings();
        Box box=new BoxWeight();
        box.greetings();

        BoxWeight box4=new BoxWeight();
        BoxWeight.greetings();  // you can inherit but you can't override

    }
}
