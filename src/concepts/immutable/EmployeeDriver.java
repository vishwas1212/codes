package concepts.immutable;

public class EmployeeDriver {
    static void main() {
        Address address = new Address(801301, "Ayodhya");
        Employee employee = new Employee(101, "Ramraja", address);
        System.out.println(employee);
        address.setCity("Lanka");
        System.out.println(employee);
    }
}
