package concepts.designpatterns.creational;

public class UserBuilder {
    private String name;
    private int age;
    private String email;

    public UserBuilder(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.email = builder.email;
    }

    static class Builder {
        private String name;
        private int age;
        private String email;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder build() {
            return new UserBuilder(this);
        }
    }

    @Override
    public String toString() {
        return "UserBuilder{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
