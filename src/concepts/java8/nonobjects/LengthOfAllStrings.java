package concepts.java8.nonobjects;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LengthOfAllStrings {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("java", "scala", "javascript", "ruby");

        Map<String, Integer> collect
                = names.stream()
                .collect(Collectors.toMap(s -> s, String::length));
        System.out.println(collect);
        String str = "Find the correct word";
        Map<String, Integer> collect1 = Arrays.stream(str.split("\\s+"))
                .collect(Collectors.toMap(s -> s, String::length));

        collect1.values().stream().filter(i -> i % 2 == 0).sorted(Comparator.reverseOrder());;


    }
}
