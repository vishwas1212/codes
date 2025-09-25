package concepts.java8.nonobjects;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConCatTwoListStrings {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("Java", "8");
        List<String> list2 = Arrays.asList("explained", "through", "programs");

        List<String> collected = Stream.concat(list1.stream(), list2.stream())
                .collect(Collectors.toList());
        System.out.println(collected);
    }
}
