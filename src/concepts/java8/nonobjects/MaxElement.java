package concepts.java8.nonobjects;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxElement {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);

        myList.stream()
                .max(Comparator.comparingInt(Integer::intValue))
                .ifPresent(System.out::println);

        Integer i = myList.stream()
                .max(Comparator.naturalOrder())
                .get();
        System.out.println(i);

    }
}
