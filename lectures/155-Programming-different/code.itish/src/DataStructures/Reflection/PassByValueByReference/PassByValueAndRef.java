package DataStructures.Reflection.PassByValueByReference;

public class PassByValueAndRef {
    // Java always 100% time pass by value
    // but when a object that have value passes in a memory address
    // so it can appear to be passing by reference

    public static void main(String[] args) {
        Cheese myCheese = new Cheese();
        System.out.println(myCheese.getCheese());// 15
        incrementCheese(myCheese);
        System.out.println(myCheese.getCheese());// 20
    }
    public static void incrementCheese(Cheese cheese){
        cheese = new Cheese();
        cheese.setCheese(cheese.getCheese() + 5);
    }
}
