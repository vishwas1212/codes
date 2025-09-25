package concepts.java8.nonobjects;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicatesCharsInString {
    public static void main(String[] args) {
        String inputString = "Java Concept Of The Day";
        inputString = inputString.replaceAll("\\s+", "").toLowerCase();
        Set<String> characterSet = new HashSet<>();
        Set<String> duplicateSet = Arrays.stream(inputString.split(""))
                .filter(c -> !characterSet.add(c))
                .collect(Collectors.toSet());
        System.out.println(duplicateSet);
    }
}
