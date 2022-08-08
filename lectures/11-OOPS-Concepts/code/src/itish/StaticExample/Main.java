package itish.StaticExample;

public class Main {
    public static void main(String[] args) {
//        Human itish = new Human(22,"Itish Prasad",10000,false);
//        Human hailee = new Human(27,"Haillee stainfield",43121,true);
//        Human shawn = new Human(26,"shawn mendes",21,true);

//        System.out.println(itish.name);
//        System.out.println(hailee.name);

        System.out.println(Human.population);
        System.out.println(Human.population);
        fun();

    }

    static void fun() {
        // because static methods only access static data it can't access non static data.
        //greetings();// Non-static method 'greetings()' cannot be referenced from a static context
        // static method not depenant on object but non-static dependant on object.

        // to access the non-static members you have to create a object and by objRef you can access
        Main obj = new Main();
        obj.greetings();
        System.out.println("some");
    }

    void greetings() {
        System.out.println("hello world");
//        fun();// possiable

    }
}
