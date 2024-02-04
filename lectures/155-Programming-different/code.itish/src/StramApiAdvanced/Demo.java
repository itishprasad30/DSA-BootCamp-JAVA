package StramApiAdvanced;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Demo {
    public static void main(String[] args) {
        int[] arr = IntStream.of(10,87,97,43,121,20)
                .map(n->n*2)
                .distinct()
                .sorted()
                .toArray();
        System.out.println(Arrays.toString(arr));
    }
}
