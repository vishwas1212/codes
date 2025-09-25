package concepts.java8.objects;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeeAverageSalDriver {
    public static void main(String[] args) {

        Employee e1 = new Employee("Alice", "HR", 50000L);
        Employee e2 = new Employee("Bob", "Finance", 60000L);
        Employee e3 = new Employee("Charlie", "Engineering", 75000L);
        Employee e4 = new Employee("David", "Marketing", 55000L);
        Employee e5 = new Employee("Eve", "Sales", 52000L);
        Employee e6 = new Employee("Frank", "Engineering", 80000L);
        Employee e7 = new Employee("Grace", "HR", 51000L);
        Employee e8 = new Employee("Heidi", "Finance", 62000L);
        Employee e9 = new Employee("Ivan", "Marketing", 57000L);
        Employee e10 = new Employee("Judy", "Sales", 53000L);

        List<Employee> empList = Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10);

        Map<String, Double> avgSalDept = empList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.averagingLong(Employee::getSalary)));
        System.out.println(avgSalDept);

        empList.stream()
                .collect(Collectors.groupingBy(Employee::getSalary,
                        Collectors.counting()));
    }
}
