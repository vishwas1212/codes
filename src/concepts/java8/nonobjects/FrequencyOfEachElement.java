package concepts.java8.nonobjects;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachElement {
    public static void main(String[] args) {


        List<String> stationeryList = Arrays
                .asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");
        Map<String, Long> stringLongMap = stationeryList.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(stringLongMap);

        System.out.println("--------------------------");
        System.out.println("Sorted Order");
        TreeMap<String, Long> treeMap = new TreeMap<>(stringLongMap);
        System.out.println(treeMap);

        List<String> listOfStrings = Arrays.asList("apple", "apple", "grapes", "mango", "grapes");
        Map<String, Long> longMap = listOfStrings.stream()
                .collect(Collectors.groupingBy
                        (Function.identity(),
                                Collectors.counting()));
        TreeMap tm=new TreeMap(longMap);
        LinkedHashMap lm = new LinkedHashMap(longMap);
        System.out.println(longMap);
        System.out.println(tm);
        System.out.println(lm);
    }
}
