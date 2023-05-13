package Demo1.EuqalsandDoubleEuquals;

public class Main {
    public static void main(String[] args) {
        //int num1 = 4;
        //int num2 = 4;
//        String name1 = new String("john");
//        String name2 = new String("john");
        Dog myDog = new Dog("taylor");
        Dog yourDog = new Dog("taylor");
        System.out.println(myDog);
        System.out.println(yourDog);

        System.out.println(myDog.hashCode());
        System.out.println(yourDog.hashCode());
        if(myDog.equals(yourDog)){
            System.out.println("both are equals");
        }else {
            System.out.println("not equals");
        }
    }
}
