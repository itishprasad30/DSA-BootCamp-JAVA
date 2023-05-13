package itish.ComparableVsComparator;

import java.util.Arrays;

public class NoramlSorting {
    public static void main(String[] args) {
        // creating a normal primitive array
        int []intArr = {13,55,32,87,77,43};
        //print the Array element
        System.out.println(Arrays.toString(intArr));//[13, 55, 32, 87, 77, 43]

        // After sorting
        System.out.println("After sorting");
        Arrays.sort(intArr);
        System.out.println(Arrays.toString(intArr)); //[13, 32, 43, 55, 77, 87]

        // creating a string
        String[] str = {"pintu","zayn","justin","taylor","Ana taylor"}; //[pintu, zayn, justin, taylor, Ana taylor]
        System.out.println(Arrays.toString(str));

        // after sorting
        Arrays.sort(str);
        System.out.println(Arrays.toString(str)); // [Ana taylor, justin, pintu, taylor, zayn]



    }
}
