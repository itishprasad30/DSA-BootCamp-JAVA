package Demo1;


public class Constructor {
    String name ;
    int id;
    public Constructor (){
        System.out.println("Default Constructor");
    }
    // one parametrised constructor
    public Constructor (String n){
        this.name = n;
    }
    // two parametrised Constructor
    public Constructor(String n , int id){
        this.name = n;
        this.id = id;
    }

    public String getName() {
        return name;
    }



    public int getId() {
        return id;
    }



    @Override
    public String toString() {
        return "Name= "+ name + "\n Id = "+ id ;
    }

    public static void main(String[] args) {
        Constructor c1 = new Constructor();
        System.out.println(c1); // Demo1.Constructor@7699a589
        Constructor c2 = new Constructor("itish");
        System.out.println(c2);
        Constructor c3 = new Constructor("Pintu", 30);
        System.out.println(c3);

    }
}
