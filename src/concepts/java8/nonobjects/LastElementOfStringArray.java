package concepts.java8.nonobjects;

import java.util.Arrays;
import java.util.List;

public class LastElementOfStringArray {
    public static void main(String[] args) {

        List<String> listOfStrings = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six");
        System.out.println(listOfStrings.get(listOfStrings.size()-1));
        String lastElement = listOfStrings.stream().skip(listOfStrings.size() - 1).findFirst().get();
        System.out.println(lastElement);
    }
}
