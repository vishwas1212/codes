package concepts.java8.nonobjects;

import java.util.Arrays;

public class ReverseOfEachWord {
    public static void main(String[] args) {
        String inputString = "Java Concept Of The Day";

        Arrays.stream(inputString.split(" "))
                .map(word -> new StringBuffer(word).reverse())
                .forEach(System.out::println);
    }
}
