package StramApiAdvanced;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamApiBasic {
    public static void main(String[] args) {

        // primitive data type array to Stream any array to strema

        int [] arrayInt = {1,2,3,4,5,6};
        IntStream streamObj = Arrays.stream(arrayInt);

        streamObj.forEach(System.out::println); // 1 2 3 4 5 6

        // Object type to Array
        Integer[] arrayInteger = {7,8,9};
        Stream<Integer> objStram = Stream.of(arrayInteger);
        objStram.forEach(System.out::println); // 7 8 9


    }
}
