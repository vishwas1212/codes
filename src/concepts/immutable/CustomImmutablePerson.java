package concepts.immutable;

/*
Final Class: Prevents subclassing

Final Fields: All fields are final

Defensive Copies:

Date objects cloned in constructor and getter

Collections wrapped in unmodifiable views

Arrays copied with Arrays.copyOf()

No Setters: Only getters that return copies or immutable views

Thread Safety: Guaranteed by immutability

Builder Pattern: Optional but recommended for complex construction
 */

import java.util.*;

public final class CustomImmutablePerson {

    private final int id;
    private final String name;
    private final Date birthDate;
    private final List<String> hobbies;
    private final String[] favoriteFoods;
    private final Map<String, String> attributes;

    public CustomImmutablePerson(int id, String name, Date birthDate, List<String> hobbies, String[] favoriteFoods, Map<String, String> attributes) {
        Objects.requireNonNull(name, "Name cant be null");
        Objects.requireNonNull(birthDate, "Birthdate cant be null");
        Objects.requireNonNull(hobbies, "Hobbies cant be null");
        Objects.requireNonNull(favoriteFoods, "FavouriteFoods cant be null");
        Objects.requireNonNull(attributes, "Attributes cant be null");

        this.id = id;
        this.name = name;

        //Defensive Way Of Creating and Copying Objects
        this.birthDate = new Date(birthDate.getTime());
        this.hobbies = Collections.unmodifiableList(new ArrayList<>(hobbies));
        this.favoriteFoods = Arrays.copyOf(favoriteFoods, favoriteFoods.length);
        this.attributes = Collections.unmodifiableMap(new HashMap<>(attributes));
    }

    // Getters with defensive copying for mutable fields
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getBirthDate() {
        return new Date(birthDate.getTime());
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public String[] getFavoriteFoods() {
        return Arrays.copyOf(favoriteFoods, favoriteFoods.length);
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }

    public static class Builder {
        private int id;
        private String name;
        private Date dateOfBirth;
        private List<String> hobbies = new ArrayList<>();
        private String[] favouriteFoods = new String[0];
        private Map<String, String> attributes = new HashMap<>();

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder dateOfBirth(Date date) {
            this.dateOfBirth = new Date(date.getTime());
            return this;
        }

        public Builder hobbies(List<String> hobbies) {
            this.hobbies = new ArrayList<>(hobbies);
            return this;
        }

        public Builder favouriteFoods(String[] foods) {
            this.favouriteFoods = Arrays.copyOf(foods, foods.length);
            return this;
        }

        public Builder attributes(Map<String, String> attr) {
            this.attributes = new HashMap<>(attr);
            return this;
        }

        public CustomImmutablePerson build() {
            return new CustomImmutablePerson(id, name, dateOfBirth, hobbies, favouriteFoods, attributes);
        }
    }

    @Override
    public String toString() {
        return "CustomImmutablePerson{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", hobbies=" + hobbies +
                ", favoriteFoods=" + Arrays.toString(favoriteFoods) +
                ", attributes=" + attributes +
                '}';
    }
}
