package concepts.java8.nonobjects;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BigramFrequency {
    static void main() {
        String str = "abbcbabaabc";

        Map<String, Long> map = IntStream.range(0, str.length() - 1)
                .mapToObj(i -> str.substring(i, i + 2))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);

    }
}
