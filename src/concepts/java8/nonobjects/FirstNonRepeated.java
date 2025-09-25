package concepts.java8.nonobjects;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeated {
    public static void main(String[] args) {
        String input = "Java articles are Awesome";

        Character c = input.chars()
                .mapToObj(m -> Character.toLowerCase(Character.valueOf((char) m)))
                .collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()))
                .entrySet().stream().filter(i -> i.getValue() == 1)
                .map(m -> m.getKey())
                .findFirst()
                .get();
        System.out.println(c);

        //firstRepeated in one stream
        Character c1 = input.chars()
                .mapToObj(ch -> Character.toLowerCase(Character.valueOf((char) ch)))
                .collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()))
                .entrySet().stream().filter(i -> i.getValue() > 1)
                .map(k -> k.getKey())
                .findFirst()
                .get();
        System.out.println(c1);

    }
}
