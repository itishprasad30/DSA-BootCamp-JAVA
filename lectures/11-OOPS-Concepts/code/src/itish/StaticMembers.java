package itish;

import java.util.Arrays;

public class StaticMembers {
//    static  {
//        System.out.println("static block inside ");
//
//        // create a array
//        String [] arr = {"some","value"};
////        main(arr);
//    }
    public static void main(String[] args) {
        // create a new array
        int [] arr = new int[3];
        arr[0] = 65;
        arr[1] = 66;
        arr[2] = 67;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        System.out.println(Arrays.toString(arr));//[65, 66, 67 ]
        System.out.println(arr); // it will print : [I@7699a589



    }

}
