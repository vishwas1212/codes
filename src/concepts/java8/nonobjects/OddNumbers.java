package concepts.java8.nonobjects;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class OddNumbers {
    public static void main(String[] args) {
        Stream.iterate(new int[]{1, 3}, f -> new int[]{f[1], f[1] + 2})
                .limit(10)
                .map(f -> f[0])
                .forEach(i -> System.out.print(i + "\t"));
        System.out.println();
        IntStream.rangeClosed(1, 20).filter(i -> i % 2 != 0).forEach(System.out::println);
    }
}
