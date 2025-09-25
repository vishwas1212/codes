package concepts.java8.nonobjects;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class NumberRepeated {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4};

        List<Integer> integerList = Arrays.stream(num)
                .boxed()
                .collect(Collectors.toList());
        Set<Integer> integerSet = new HashSet<>(integerList);
        boolean flag = false;
        if (integerSet.size() == integerList.size()) {
            flag = false;
        } else {
            flag = true;
        }
        System.out.println(flag);
        Set<Integer> setData = new HashSet<>();
        boolean b = integerList.stream()
                .anyMatch(a -> !setData.add(a));
        System.out.println(b);

        String json = """
    {
        "name": "John Doe",
        "age": 30,
        "address": {
            "street": "123 Main St",
            "city": "New York"
        }
    }
    """;
        System.out.println(json instanceof String);

    }
}
