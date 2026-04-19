package demo;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public abstract class Demo2 {
    static void main() {
        String s = "vishwas vi";
        // 2nd duplicate character
        //index positions

        Map.Entry<Character, Long> entry = s.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() > 1).skip(1).findFirst().get();

        System.out.println(entry);

        IntStream.range(0, s.length())
                .filter(c -> s.charAt(c) == 'i').forEach(System.out::println);

    }
}
