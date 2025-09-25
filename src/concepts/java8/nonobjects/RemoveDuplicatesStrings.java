package concepts.java8.nonobjects;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicatesStrings {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays
                .asList("Java", "Python", "C#", "Java", "Kotlin", "Python");

        //No Order Maintains
        Set<String> stringSet = listOfStrings.stream().collect(Collectors.toSet());

        //Insertion Order Maintains
        List<String> stringList = listOfStrings.stream().distinct().collect(Collectors.toList());

        System.out.println(stringSet);
        System.out.println(stringList);

        System.out.println("----------------------------");
        //sort the lits according to the length of the string

        listOfStrings.stream()
                .sorted(Comparator.comparing(String::length))
                .forEach(System.out::println);
        System.out.println("--------in reverseed order----");
        listOfStrings.stream()
                .sorted(Comparator.comparing(String::length).reversed())
                .forEach(System.out::println);

    }
}
