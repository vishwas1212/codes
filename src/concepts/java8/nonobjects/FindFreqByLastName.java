package concepts.java8.nonobjects;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFreqByLastName {
    static void main() {
        List<String> names = Arrays.asList
                ("Ram Raja", "Manoj Pandey", "Shakuntala Devi", "Vishwas Vimal", "Vaibhav Vimal",
                        "Kashmira Vimal", "Muskan Pandey", "Alice Johnson", "Bob Smith", "Charlie Brown",
                        "Diana Prince", "Ethan Hunt", "Fiona Gallagher", "George Martin", "Hannah Lee",
                        "Irene Adler", "Jack Ryan");
        Map<String, Long> lastNameFreqMap = names.stream()
                .map(name -> {
                    String[] parts = name.split(" ");
                    String lastName = parts[parts.length - 1];
                    return lastName;
                }).collect(Collectors.groupingBy(lastName -> lastName, Collectors.counting()));

        System.out.println(lastNameFreqMap);

        Map<String, Long> map = names.stream()
                .map(name -> name.split(" ")[name.split(" ").length-2])
                .collect(Collectors.groupingBy(lastName -> lastName, Collectors.counting()));

        System.out.println(map);
    }
}
