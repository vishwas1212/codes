package concepts.java8.nonobjects.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ReduceExample {
    static void main() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        Integer max = numbers.stream().reduce(0, (a, b) -> a > b ? a : b);
        System.out.println(max);

        Integer min = numbers.stream().reduce(Integer.MAX_VALUE, (a, b) -> a < b ? a : b);
        System.out.println(min);

        String concat = Stream.of("Java", "Stream", "Reduce").reduce("", (a, b) -> a + " " + b);
        System.out.println(concat);

        Integer multiply = numbers.stream().reduce(1, (a, b) -> a * b);
        System.out.println(multiply);

        Integer sum = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(sum);

        Integer sub = numbers.stream().reduce(0, (a, b) -> a - b);
        System.out.println(sub);

        String longest = List.of("Raj", "Meena", "Alexander").stream().reduce("", (a, b) -> a.length() >= b.length() ? a : b);
        System.out.println(longest);

        Integer totalCount = List.of("Raj", "Meena", "Alexander").stream().reduce(0, (a, b) -> a + b.length(), Integer::sum);
        System.out.println(totalCount);

    }
}
