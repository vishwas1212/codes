package concepts.java8.nonobjects.parallelmap;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindEvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = IntStream.rangeClosed(1, 10_000_000)
                .boxed()
                .collect(Collectors.toList());

        long start = System.currentTimeMillis();
        List<Integer> evens = numbers.parallelStream()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());

        long end = System.currentTimeMillis();
        System.out.println("parallelStream result size: " + evens.size());
        System.out.println("Time taken: " + (end - start) + " ms");

    }
}
