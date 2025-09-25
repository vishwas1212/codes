package concepts.java8.nonobjects;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostMinFrequentElement {
    public static void main(String[] args) {

        List<String> listOfStrings = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");

        Map<String, Long> findElementFreq = listOfStrings.stream()
                .collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting()));
        System.out.println(findElementFreq);
        Map.Entry<String, Long> mostFreqElement = findElementFreq.entrySet().stream()
                .max(Map.Entry.comparingByValue()).get();

        System.out.println(mostFreqElement.getKey() + ": " + mostFreqElement.getValue());
        Map.Entry<String, Long> minFreqElemet = findElementFreq.entrySet()
                .stream()
                .min(Map.Entry.comparingByValue()).get();
        System.out.println(minFreqElemet.getKey() + ": " + minFreqElemet.getValue());
    }
}
