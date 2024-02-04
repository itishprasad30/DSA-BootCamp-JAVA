package StramApiAdvanced;

import java.util.Arrays;
import java.util.List;

public class Map_FlatMap {
    public static void main(String[] args) {
        // map is used to transfermation
        List<String> words = Arrays.asList("Hello","World");

        List<String> uppercaseWords = words.stream()
                .map(String::toUpperCase)
                .toList();
        System.out.println("Using map : "+ uppercaseWords);

        //flat map is used to tranfermation and flating
        List<List<Integer>> nestedList = Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(4,5,6),
                Arrays.asList(7,8,9)
        );

        System.out.println(nestedList);
        System.out.println(words);

        List<Integer> flateningList = nestedList.stream()
                .flatMap(List::stream)
                .map(n->n*2)
                .toList();

        System.out.println("Flattening list :: " + flateningList);



    }
}
