package concepts.custom.comparators;

public class CustomComparatorPerson {

    private String name;
    private int age;

    public CustomComparatorPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "CustomComparatorPerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
