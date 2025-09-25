package concepts.custom.immutable;

import java.util.*;

public class CustomImmutablePersonDriver {
    public static void main(String[] args) {

        Date date = new Date();
        List<String> hobbies = Arrays.asList("Hiking", "Reading");
        String[] foods = {"Pizza, Sushi"};
        Map<String, String> attr = new HashMap<>();
        attr.put("bloodType", "O+");

        CustomImmutablePerson person1 = new CustomImmutablePerson(1, "Alice", date, hobbies, foods, attr);
        CustomImmutablePerson person2 = new CustomImmutablePerson.Builder()
                .id(2)
                .name("Bob")
                .dateOfBirth(new Date())
                .hobbies(Arrays.asList("Gaming", "Cooking"))
                .favouriteFoods(new String[]{"Burger", "Pasta"})
                .attributes(Collections.singletonMap("Allregy", "Peanuts"))
                .build();

        System.out.println(person1);
        System.out.println(person2);

        try {
            person1.getHobbies().add("Cheating");
        } catch (UnsupportedOperationException e) {
            System.out.println("Confirmed: Hobbies list is immutable");
        }

        try {
            person1.getAttributes().put("Nature","Jolly");
        } catch (UnsupportedOperationException e) {
            System.out.println("Confirmed: Attributes map is immutable");
        }

    }
}
