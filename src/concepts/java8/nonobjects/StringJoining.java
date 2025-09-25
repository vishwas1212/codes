package concepts.java8.nonobjects;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringJoining {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays
                .asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");

        String collected = listOfStrings.stream()
                .collect(Collectors.joining(",", "[", "]"));
        System.out.println(collected);
    }
}
