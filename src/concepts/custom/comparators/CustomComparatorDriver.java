package concepts.custom.comparators;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CustomComparatorDriver {
    public static void main(String[] args) {
        List<CustomComparatorPerson> persons = Arrays.asList(
                new CustomComparatorPerson("Alice", 30),
                new CustomComparatorPerson("Bob", 25),
                new CustomComparatorPerson("Charlie", 35),
                new CustomComparatorPerson("Alice", 20),
                new CustomComparatorPerson(null, 40),
                new CustomComparatorPerson(null, 0)
        );

        System.out.println("Original Order");
        persons.forEach(System.out::println);

        // Sort by name (nulls first)
        persons.sort(Comparator.comparing(CustomComparatorPerson::getName,
                Comparator.nullsFirst(Comparator.naturalOrder())));

        System.out.println("\nSorted by name (nulls first):");
        persons.forEach(System.out::println);

        // Sort by age descending (nulls last)
        persons.sort(Comparator.comparing(CustomComparatorPerson::getAge,
                Comparator.nullsLast(Comparator.reverseOrder())));

        System.out.println("\nSorted by age descending (nulls last):");
        persons.forEach(System.out::println);

        // Complex sort: name ascending, then age descending
        Comparator<CustomComparatorPerson> complexComparator = Comparator.comparing(
                        CustomComparatorPerson::getName, Comparator.nullsFirst(Comparator.naturalOrder()))
                .thenComparing(Comparator.comparing(CustomComparatorPerson::getAge,
                        Comparator.nullsLast(Comparator.reverseOrder())));

        persons.sort(complexComparator);
        System.out.println("\nSorted by name (asc) then age (desc):");
        persons.forEach(System.out::println);
    }
}
