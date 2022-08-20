package itish.inheritance;

public   class Box {
    double l;
    double w;
    double h;

    static void greetings(){
        System.out.println("hey ,I am in Box Class grettins");
    }

    Box (){
        this.l = -1;
        this.w = -1;
        this.h = -1;
    }

    // cube
    Box(double side){
        this.l = side;
        this.w = side;
        this.h = side;
    }

     Box(double l, double h, double w) {
        this.l=l;
        this.h=h;
        this.w=w;
    }

    // Copy constructor

    Box( Box old){
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }

    public void information(){
        System.out.println("Running the Box");
    }


}
