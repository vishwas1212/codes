package concepts.java8.nonobjects;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachChar {
    public static void main(String[] args) {
        String inputString = "Java Concept Of The Day";
        Map<Character, Long> characterLongMap = inputString
                .chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors
                        .groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(characterLongMap);
        System.out.println("--------------");

        inputString
                .chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors
                        .groupingBy(Function.identity(), Collectors.counting()));

        String replace = inputString.replace(" ", "");
        System.out.println(replace);
        Map<Character, Long> integerLongMap = replace
                .toLowerCase()
                .chars()
                .mapToObj(m ->(char) m)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(integerLongMap);
    }
}
