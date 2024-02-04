package StramApiAdvanced;

import java.util.ArrayList;
import java.util.List;

public class TraditionalVsStramAPi {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // find sum of the even numbers square
        int sumOfSquare = 0;
        for (int num : numbers){
            if(num %2 == 0){
                int square = num* num; // sq of the number
                sumOfSquare += square; // added to sum
            }
        }

        System.out.println("Sum of square  (Traditional ) " + sumOfSquare);

        System.out.println("-----------");

        // Using Stream API
        int sumOfSqueareStreamApi = numbers.stream()
                .filter(n->n%2==0)
                .mapToInt(n-> n *n)
                .sum();

        System.out.println("Sum of squeare Steam APi = " + sumOfSqueareStreamApi);

    }
}
