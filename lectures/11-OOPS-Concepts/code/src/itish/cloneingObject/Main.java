package itish.cloneingObject;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {



        Human itish = new Human("Itish",12);

//        Human twins = new Human(itish);

        Human twins = (Human) itish.clone();

        // Shallow Copy
        System.out.println(Arrays.toString(twins.arr));
        twins.arr[0] = 100; // after changing the it will changes in the both array

        System.out.println(Arrays.toString(twins.arr)); //[100, 2, 3, 4, 5]
        System.out.println(Arrays.toString(itish.arr)); // [100, 2, 3, 4, 5]

        // After Deep Copy output like
        System.out.println(Arrays.toString(twins.arr)); // [1,2,3,4,5]
        twins.arr[0] = 100; // after changing the it will changes in the both array

        System.out.println(Arrays.toString(twins.arr)); //[100, 2, 3, 4, 5]
        System.out.println(Arrays.toString(itish.arr)); // [1, 2, 3, 4, 5]


    }
}
