package itish;

public class StaticMembers {
    static  {
        System.out.println("static block inside ");

        // create a array
        String [] arr = {"some","value"};
        main(arr);
    }
    public static void main(String[] args) {
        System.out.println("main Method inside");
    }

}
