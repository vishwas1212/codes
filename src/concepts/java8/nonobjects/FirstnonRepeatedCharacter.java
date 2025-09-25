package concepts.java8.nonobjects;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstnonRepeatedCharacter {
    public static void main(String[] args) {
        String inputString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();

        LinkedHashMap<String, Long> linkedHashMap = Arrays.stream(inputString.split(""))
                .collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()));
        System.out.println(linkedHashMap);

        String firstNonRepeatedChar = linkedHashMap.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(entry -> entry.getKey())
                .findFirst()
                .get();
        System.out.println(firstNonRepeatedChar);
    }
}
