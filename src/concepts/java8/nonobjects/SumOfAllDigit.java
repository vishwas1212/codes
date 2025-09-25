package concepts.java8.nonobjects;

import java.util.stream.Stream;

public class SumOfAllDigit {
    public static void main(String[] args) {
        int i = 1563;

        Integer collected = Stream.of(String.valueOf(i).split(""))
                .mapToInt(Integer::parseInt).sum();
        System.out.println(collected);
    }
}
