package concepts.java8.nonobjects;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLargestMaxMinNumber {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        Integer secondMax = listOfIntegers.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();

        System.out.println(secondMax);

        Integer max = listOfIntegers.stream()
                .max(Comparator.naturalOrder())
                .get();
        System.out.println(max);

        Integer secondMaxByFilter = listOfIntegers.stream()
                .filter(i -> !i.equals(max))
                .max(Comparator.naturalOrder())
                .get();
        System.out.println(secondMaxByFilter);
        System.out.println("----------------------------");
        Integer secondMin = listOfIntegers.stream()
                .sorted(Comparator.naturalOrder())
                .skip(1)
                .findFirst()
                .get();
        System.out.println(secondMin);

        Integer secondMinByFilter = listOfIntegers.stream()
                .filter(i -> !i.equals(listOfIntegers.stream().min(Comparator.naturalOrder()).get()))
                .min(Comparator.naturalOrder())
                .get();
        System.out.println(secondMinByFilter);
    }
}
