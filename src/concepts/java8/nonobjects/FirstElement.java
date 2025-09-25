package concepts.java8.nonobjects;

import java.util.Arrays;
import java.util.List;

public class FirstElement {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);

        myList.stream()
                .findFirst()
                .ifPresent(System.out::println);

        myList.stream()
                .skip(myList.size() - 1)
                .findFirst()
                .ifPresent(System.out::println);

        //with int[]

        int[] arr = {10, 15, 8, 49, 25, 98, 98, 32, 15};
        Arrays.stream(arr)
                .boxed()
                .findFirst()
                .ifPresent(System.out::println);
    }
}
