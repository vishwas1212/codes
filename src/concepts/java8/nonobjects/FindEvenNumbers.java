package concepts.java8.nonobjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class FindEvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = IntStream.rangeClosed(1, 10_000_000)
                .boxed()
                .toList();

        long start = System.currentTimeMillis();

        List<Integer> evens = numbers.stream()
                .filter(i -> i % 2 == 0)
                .toList();

        long end = System.currentTimeMillis();

        System.out.println("The size of the even list: " + evens.size());
        System.out.println("Total Time Taken " + (end - start) + "ms");
    }
}
