package concepts.java8.nonobjects;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortStringByFrequency {
    static void main() {
        String string = "aaaccccbb";

        Map<Character, Long> collect = string.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        System.out.println(collect);

        List<Map.Entry<Character, Long>> collect1 = collect.entrySet().stream()
                .sorted(Map.Entry.comparingByValue()).collect(Collectors.toList());

        System.out.println(collect1);

        String collect2 = collect1.stream()
                .map(entry -> String.valueOf(entry.getKey()).repeat(entry.getValue().intValue()))
                .collect(Collectors.joining());

        System.out.println(collect2);


    }
}
