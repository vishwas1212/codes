package concepts.java8.nonobjects;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxAndMinNumber {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        Integer max = listOfIntegers.stream().max(Comparator.naturalOrder()).get();

        System.out.println(max);

        Integer min = listOfIntegers.stream().min(Comparator.naturalOrder()).get();

        System.out.println(min);
        System.out.println("-------------------------------");
        //find the 2nd largest number

        Integer secondndLargest = listOfIntegers.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();

        System.out.println(secondndLargest);
    }
}
