package StramApiAdvanced;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample2 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 6, 7, 8, 8, 9, 10);

        // intermidate Opertion
        List<Integer> squredNum = numbers.stream()
                .filter(n -> n % 2 == 0)  // filter even number
                .map(n -> n * n)   // square each number
                .distinct()    // remove duplicate
                .peek(System.out::println)  // peek into the stram (for debugging)
                .toList();    // collec the results into a list

        System.out.println("Squared numbers" + squredNum);

        // Termial Operation
        long count = numbers.stream()
                .filter(n -> n > 5)   // filter numbers greater that 5
                .count();   // count the remaining numbers

        System.out.println("Count of numbers > 5 : " + count);

        int sum = numbers.stream()  // convert interger stram to intstram
                .mapToInt(Integer::intValue) // calculate the sum
                .sum();

        System.out.println("Sum of Numbers : " + sum);


    }
}
