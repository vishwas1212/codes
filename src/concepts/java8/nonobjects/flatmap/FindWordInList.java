package concepts.java8.nonobjects.flatmap;

import java.util.Arrays;
import java.util.List;

public class FindWordInList {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("java scala ruby", "java react spring java");
        String word = "java";
        long counted = strings.stream().flatMap(s -> Arrays.stream(s.split(" ")))
                .filter(w -> w.equals(word))
                .count();
        System.out.println(word + ": " + counted);
    }
}
