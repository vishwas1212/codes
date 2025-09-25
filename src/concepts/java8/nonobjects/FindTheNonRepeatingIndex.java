package concepts.java8.nonobjects;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindTheNonRepeatingIndex {
    public static void main(String[] args) {
        String str = "ssrrq";

        LinkedHashMap<Character, Long> freqMap = str.chars().mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()));
        int idx = IntStream.range(0, str.length())
                .filter(i -> str.chars().filter(ch -> ch == str.charAt(i)).count() == 1)
                .findFirst().getAsInt();

        System.out.println(idx);

    }
}
