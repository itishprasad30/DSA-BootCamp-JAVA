package ReflectionApi;

public class Cat {
    private final String name;
    private int age;

    public Cat(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void meow(){
        System.out.println("cat says Meow");
    }
    private void heyThisIsPrivate(){
        System.out.println("How did you call this method ?");
    }
    public static void thisIsPublicStaticMethod(){
        System.out.println(" I am public static method ");
    }

    private static void thisIsPrivateStaticMethod(){
        System.out.println("Hey , I am privatee static method");
    }


}
