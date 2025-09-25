package concepts.java8.nonobjects;

import java.util.Arrays;
import java.util.List;

public class StringSpecificLetter {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("java", "scala", "javascript", "ruby");
        char letter = 'j';

        List<String> findStringsWithLetter = names.stream()
                .filter(c -> c.startsWith(String.valueOf(letter)))
                .toList();
        System.out.println(findStringsWithLetter);
    }
}
