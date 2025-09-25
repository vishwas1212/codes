package concepts.java8.nonobjects;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringAnagramsCheck {
    public static void main(String[] args) {
        String s1 = "RaceCar";
        String s2 = "CarRace";
        String s = Stream.of(s1.split(""))
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.joining());
        String s3 = Stream.of(s2.split(""))
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.joining());
        if (s.equals(s3)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }

        Stream.of(s1.split(""))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
        Stream.of(s2.split(""))
                .map(String::toLowerCase)
                .sorted()
                .forEach(System.out::println);
    }
}
