package concepts.java8.nonobjects;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicatesInArray {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222);

        Set<Integer> uniqueSet = new HashSet<>();
        Set<Integer> integerSet = listOfIntegers.stream()
                .filter(i -> !uniqueSet.add(i)).collect(Collectors.toSet());
        System.out.println(listOfIntegers);
        System.out.println(uniqueSet);
        System.out.println(integerSet);
        System.out.println("-----------------");
        //remove duplicates from array
        Integer[] array = {5, 10, 3, 7, 2, 10, 5};

        Integer[] distinctArr = Arrays.stream(array).distinct().toArray(Integer[]::new);
        System.out.println(Arrays.toString(distinctArr));
    }
}
