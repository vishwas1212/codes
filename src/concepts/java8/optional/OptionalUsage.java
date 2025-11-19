package concepts.java8.optional;

import java.util.Optional;

public class OptionalUsage {
    static void main() {
        Optional<String> name = Optional.of("Ram");
        System.out.println(name.get());

        Optional<String> empty = Optional.empty();
        System.out.println(empty.isPresent());


        String possibleNull = null;

    }
}
