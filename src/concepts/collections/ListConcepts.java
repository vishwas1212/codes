package concepts.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListConcepts {
    static void main() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(list);

        list = Arrays.asList(1, 2, 3, 4, 5, 61, 71);
        System.out.println(list);

        list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 62, 72));
        System.out.println(list);

        list = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        list.add(63);
        list.add(73);
        System.out.println(list);

        list = Stream.concat(list.stream(), Stream.of(64, 74)).toList();
        System.out.println(list);

        list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Collections.addAll(list,65,75);
        System.out.println(list);

    }
}
