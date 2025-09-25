package demo;

import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test1 {
    static void main() {
        String s1 = "55,28,1,2,77,88";
        String s2 = "66,92,0,1,52,77,88";

        Set<Integer> set = Stream.of(s1.split(","))
                .map(Integer::parseInt).collect(Collectors.toSet());

        Set<Integer> set1 = Stream.of(s2.split(","))
                .map(Integer::parseInt).collect(Collectors.toSet());

        set.retainAll(set1);
        System.out.println(set);

        String str = "abbcbabaabc";

        Map<String, Long> collect = IntStream.range(0, str.length() - 1).mapToObj(i -> str.substring(i, i + 2))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(collect);


    }
}
