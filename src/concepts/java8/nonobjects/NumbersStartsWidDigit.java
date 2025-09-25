package concepts.java8.nonobjects;

import java.util.Arrays;
import java.util.List;

public class NumbersStartsWidDigit {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 32, 11);

        myList.stream().filter(i->String.valueOf(i).startsWith("1")).forEach(System.out::println);
        System.out.println("------------------------");

        myList.stream()
                .map(s -> s + "")
                .filter(n -> n.startsWith("1"))
                .forEach(System.out::println);

        //with int[]

        int[] arr = {10, 15, 8, 49, 25, 98, 32};
        Arrays.stream(arr)
                .boxed().map(s -> s + "")
                .filter(n -> n.startsWith("1"))
                .forEach(System.out::println);
        System.out.println("-----------------------------");
        Integer arr1[] = {10, 15, 8, 49, 25, 98, 32};
        Arrays.stream(arr1)
                .map(m -> m + " ")
                .filter(i -> i.startsWith("1"))
                .forEach(System.out::println);

        int[] arr2 = {10, 15, 8, 49, 25, 98, 32};

        int a = 12;

        boolean b = String.valueOf(a)
                .startsWith("1");
        System.out.println(b);
    }
}
