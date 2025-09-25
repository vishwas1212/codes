package concepts.java8.nonobjects;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOdd {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 15, 8, 49, 25, 98, 32);

        list.stream()
                .filter(i -> i % 2 == 0)
                .forEach(System.out::println);

        list.stream()
                .filter(i -> i % 2 != 0)
                .forEach(System.out::println);

        Map<Boolean, List<Integer>> booleanListMap1 = list.stream()
                .collect(Collectors.partitioningBy(i -> i % 2 == 0));
        System.out.println(booleanListMap1);

        //when numvers are int[] array
        int[] arr = {10, 15, 8, 49, 25, 98, 32};
        Map<Boolean, List<Integer>> booleanListMap =
                Arrays.stream(arr)
                        .boxed()
                        .collect(Collectors.partitioningBy(i -> i % 2 == 0));
        System.out.println(booleanListMap);

    }
}
