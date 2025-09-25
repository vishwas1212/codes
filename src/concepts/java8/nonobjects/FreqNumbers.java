package concepts.java8.nonobjects;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FreqNumbers {
    public static void main(String[] args) {
        int arr[] = {1, 49, 2, 3, 4, 5, 6, 11, 2, 3, 1, 2, 3, 4, 5, 5};
        Map<String, Long> stringLongMap = Arrays.stream(arr)
                .mapToObj(m -> String.valueOf(m))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(stringLongMap);

        List<String> stringList = Arrays.stream(arr)
                .mapToObj(m -> m + "")
                .filter(ch -> ch.startsWith("1"))
                .collect(Collectors.toList());
        System.out.println(stringList);

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 1, 2, 3, 4, 1, 2, 3, 1, 2, 1);
        Map<Integer, Long> integerLongMap = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(integerLongMap);

        Map.Entry<Integer, Long> integerLongEntry = integerLongMap.entrySet().stream()
                .max(Comparator.comparingLong(i -> i.getValue()))
                .get();

        System.out.println(integerLongEntry);

        int[] arr1 = {1, 2, 3, 4, 5, 1, 2, 3, 4, 1, 2, 3, 5};

        Map<Integer, Long> integerLongMap1 = Arrays.stream(arr1)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(integerLongMap1);

    }
}
