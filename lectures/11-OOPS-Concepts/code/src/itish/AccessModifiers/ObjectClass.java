package itish.AccessModifiers;

public class ObjectClass {
    int num;

    public ObjectClass(int num) {
        this.num = num;
    }
    // Basically gives String representaion of object Like getClass().getName()+"@"+ hashcode()
    @Override
    public String toString() {
        return super.toString();
    }

    // Finalize basically call when garbage collection happens

//    @Override
//    protected void finalize() throws Throwable {
//        super.finalize();
//    }

    // it basically gives the number representaion of an Object

    @Override
    public int hashCode() {
        return super.hashCode();
    }


    @Override
    public boolean equals(Object obj) {
        return this.num ==((ObjectClass)obj).num;
    }



    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    public ObjectClass() {
        super();
    }

    public static void main(String[] args) {
        ObjectClass obj = new ObjectClass(32);
        ObjectClass obj2 = new ObjectClass(32);
//        System.out.println(obj.hashCode()); //14585217521
//        System.out.println(obj2.hashCode()); //1989780873
//        if(obj < obj2) // error
//            System.out.println("obj1 is less than obj2");
        if(obj == obj2)
            System.out.println("obj1 is equals to obj2");

        if(obj.equals(obj2))
            System.out.println("obj1 is equals via equals to method to obj2");

        System.out.println(obj.getClass()); //class itish.AccessModifiers.ObjectClass
    }

}
