package concepts.java8.nonobjects;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFrequencyForGivenInteger {
    static void main() {
        int n = 312134235;

        getFrequncy(n);
    }

    private static void getFrequncy(int n) {

        Map<Character, Long> map = String.valueOf(n).chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new, Collectors.counting()));

        System.out.println(map);

        String str = "abcabcdefde";

        LinkedHashMap<Character, Long> strMap = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()));

        System.out.println(strMap);

        int[] arr = {3, 1, 2, 1, 3, 0, 4, 2, 3, 5};

        LinkedHashMap<Integer, Long> arrMap = Arrays.stream(arr).boxed()
                .collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()));

        System.out.println(arrMap);

        Map.Entry<Integer, Long> freqOne = Arrays.stream(arr).boxed()
                .collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()))
                .entrySet().stream().filter(i -> i.getValue() == 1).findFirst().get();
        System.out.println(freqOne.getKey());

        Map.Entry<Integer, Long> maxFreqKey = Arrays.stream(arr).boxed()
                .collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()))
                .entrySet().stream().max(Comparator.comparing(Map.Entry::getValue)).get();
        System.out.println(maxFreqKey.getKey());

        char[] ch = {'a', 'a', 'c', 'c', 'b', 'b', 'd', 'd'};

        String.valueOf(ch).chars().boxed().map(c -> (char) c.intValue()).
                collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting())).forEach(
                        (k, v) -> System.out.println(k + " " + v)
                );

        Character[] chArr = {'a', 'a', 'c', 'c', 'b', 'b', 'd', 'd'};

        Arrays.stream(chArr)
                .collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()))
                .forEach((k, v) -> System.out.println(k + " -> " + v));

        String[] stArr = {"Alice", "Bob", "Charlie", "Alice", "David", "Eve", "Bob", "Frank"};

        String.join("", stArr).chars().boxed()
                .map(c -> (char) c.intValue())
                .collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()))
                .forEach((k, v) -> System.out.println(k + " -> " + v));

        Arrays.stream(stArr)
                .collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()))
                .forEach((k, v) -> System.out.println(k + " -> " + v));
    }
}
