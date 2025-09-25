package concepts.java8.nonobjects;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountOfList {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);

        Long collect = myList.stream()
                .collect(Collectors.counting());
        System.out.println(collect);

        long counted = myList.stream().count();
        System.out.println(counted);

        int[] arr = {10, 15, 8, 49, 25, 98, 98, 32, 15};
        long count = Arrays.stream(arr).boxed().count();
        System.out.println(count);
    }
}
