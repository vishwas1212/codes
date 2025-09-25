package concepts.java8.nonobjects;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class OddEven {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
        Map<Boolean, List<Integer>> oddEvenMap = list.stream()
                .collect(Collectors.partitioningBy(i -> i % 2 == 0));

        Set<Map.Entry<Boolean, List<Integer>>> entrySet = oddEvenMap.entrySet();
        for (Map.Entry<Boolean, List<Integer>> entry : entrySet) {
            System.out.println("---------------------------");
            if (entry.getKey()) {
                System.out.println("Even Numbers");
            } else {
                System.out.println("Odd Numbers");
            }
            System.out.println("---------------------------");
            List<Integer> value = entry.getValue();
            for (int integer : value) {
                System.out.println(integer);
            }
        }

    }
}
