package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test2 {
    public record Person(String name, int age) {
    }

    static void main() {
        Person person = new Person("Ramraja", 100000000);
        System.out.println(person.name);
        System.out.println(person.age());
        System.out.println(person);

        String json = """
                {
                "name":"Ramraja",
                "age":30,
                "id":01
                }
                """;
        System.out.println(json);
    }
}
