package concepts.java8.nonobjects.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UsageOfFlatMap {
    public static void main(String[] args) {
        List<Integer> primeNumber = Arrays.asList(1, 3, 5, 7, 11, 13, 17, 19);
        List<Integer> oddNumber = Arrays.asList(3, 5, 7, 9);
        List<Integer> evenNumber = Arrays.asList(2, 4, 6, 8);

        List<List<Integer>> listsOfListOfInteger = Arrays.asList(primeNumber, oddNumber, evenNumber);

        System.out.println(listsOfListOfInteger);

        //using flat map

        List<Integer> flatMapList = listsOfListOfInteger.stream().flatMap(list -> list.stream())
                .collect(Collectors.toList());
        System.out.println(flatMapList);

        System.out.println("---------------------");
        //with string
        // Creating a List of Lists
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("Geeks", "For"),
                Arrays.asList("GeeksForGeeks", "A computer portal"),
                Arrays.asList("Java", "Programming")
        );
        System.out.println(listOfLists);

        List<String> stringList = listOfLists.stream().flatMap(list -> list.stream())
                .collect(Collectors.toList());

        System.out.println(stringList);

    }
}
