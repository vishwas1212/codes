package concepts.java8.nonobjects;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortByLambda {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("java", "scala", "javascript", "ruby", "c#", "c", "c++");
        Collections.sort(names, (a, b) ->
                Integer.compare(a.length(), b.length()));
        System.out.println(names);
    }
}
