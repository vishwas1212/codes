package concepts.java8.nonobjects;

import java.util.Arrays;
import java.util.List;

public class StringStartsWithNum {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("One", "2wo", "3hree", "Four", "5ive", "Six");
        List<String> digitString = listOfStrings.stream()
                .filter(str -> Character.isDigit(str.charAt(0))).toList();
        System.out.println(digitString);
    }
}
