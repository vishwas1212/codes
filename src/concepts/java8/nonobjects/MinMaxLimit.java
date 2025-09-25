package concepts.java8.nonobjects;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMaxLimit {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        //Find the 3-min value from the list
        //Solution.1
        listOfIntegers.stream()
                .sorted(Comparator.naturalOrder())
                .limit(3).forEach(System.out::println);
        System.out.println("----------------");
        //Solution.2

        listOfIntegers.stream().sorted().limit(3).forEach(System.out::println);

        System.out.println("-----------------------");

        //find the 3 max limit numbers from the list
        //Solution.1
        listOfIntegers.stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .forEach(System.out::println);
        System.out.println("------------------------");
        //Solution.2
        listOfIntegers.stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .forEach(System.out::println);
    }
}
