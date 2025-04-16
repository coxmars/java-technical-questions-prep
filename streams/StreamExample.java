package streams;

import java.util.Arrays;
import java.util.List;

public class StreamExample {
    /**
     * This is a simple example of using Java Streams to filter and process a list of integers.
     * It filters out even numbers, squares them, and prints the result.
     */
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.stream()
               .filter(n -> n % 2 == 0)
               .map(n -> n * n)
               .forEach(System.out::println);
    }
}
