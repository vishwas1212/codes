package demo;


import java.util.Objects;

public class Student {
//    @Data
//
//    @EqualsAndHashCode


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", departmantName='" + departmantName + '\'' +
                ", joinedYear=" + joinedYear +
                ", city='" + city + '\'' +
                ", rank=" + rank +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartmantName() {
        return departmantName;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Student demo = (Student) o;
        return id == demo.id && age == demo.age && joinedYear == demo.joinedYear && rank == demo.rank && Objects.equals(firstName, demo.firstName) && Objects.equals(lastName, demo.lastName) && Objects.equals(gender, demo.gender) && Objects.equals(departmantName, demo.departmantName) && Objects.equals(city, demo.city);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + Objects.hashCode(firstName);
        result = 31 * result + Objects.hashCode(lastName);
        result = 31 * result + age;
        result = 31 * result + Objects.hashCode(gender);
        result = 31 * result + Objects.hashCode(departmantName);
        result = 31 * result + joinedYear;
        result = 31 * result + Objects.hashCode(city);
        result = 31 * result + rank;
        return result;
    }

    public void setDepartmantName(String departmantName) {
        this.departmantName = departmantName;
    }

    public int getJoinedYear() {
        return joinedYear;
    }

    public void setJoinedYear(int joinedYear) {
        this.joinedYear = joinedYear;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    /**

         * The id.

         */

        private int id;

        /**

         * The first name.

         */

        private String firstName;

        /**

         * The last name.

         */

        private String lastName;

        /**

         * The age.

         */

        private int age;

        /**

         * The gender.

         */

        private String gender;

        /**

         * The departmant name.

         */

        private String departmantName;

        /**

         * The joined year.

         */

        private int joinedYear;

        /**

         * The city.

         */

        private String city;

        /**

         * The rank.

         */

        private int rank;

        /**

         * Instantiates a new employee.

         *

         * @param id             the id

         * @param firstName      the first name

         * @param lastName       the last name

         * @param age            the age

         * @param gender         the gender

         * @param departmantName the departmant name

         * @param joinedYear     the joined year

         * @param city           the city

         * @param rank           the rank

         */

        public Student(int id, String firstName, String lastName, int age, String gender, String departmantName,

                       int joinedYear, String city, int rank) {

            super();

            this.id = id;

            this.firstName = firstName;

            this.lastName = lastName;

            this.age = age;

            this.gender = gender;

            this.departmantName = departmantName;

            this.joinedYear = joinedYear;

            this.city = city;

            this.rank = rank;

        }


}
