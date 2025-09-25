package concepts.java8.nonobjects;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FindListReverseOrder {
    public static void main(String[] args) {

        List<Integer> inputArrayList = Arrays.asList(1, 3, 2, 4, 3, 1, 2);

        List<Integer> outputArrayList = inputArrayList.stream()
                .distinct()
                .sorted(Comparator
                        .reverseOrder()).toList();
        System.out.println(outputArrayList);
    }
}
