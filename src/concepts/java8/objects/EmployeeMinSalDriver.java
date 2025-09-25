package concepts.java8.objects;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmployeeMinSalDriver {
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

        // It returns String and Optional Of Employee
        //Solution.1 using simple minBy() and then foreach to print
        Map<String, Optional<Employee>> minSalDeptByOptionalEmp = empList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.minBy(Comparator.comparingLong(Employee::getSalary))));

        minSalDeptByOptionalEmp.forEach((s, employee) -> {
            System.out.println(s + " : " + employee.map(Employee::getSalary).orElse(0l));
        });

        System.out.println(minSalDeptByOptionalEmp);
        System.out.println("------------------------------------------");

        // It returns the String and value, can be printed using sout
        //Solution.2 using CollectionAdnThen function
        Map<String, Long> minSalDeptByValues = empList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.collectingAndThen(
                                Collectors.minBy(Comparator.comparingLong(Employee::getSalary)),
                                opt -> opt.map(Employee::getSalary).orElse(0l))));
        System.out.println(minSalDeptByValues);

        System.out.println("-------------------------------");

        // Using toMap() we can achieve this too
        //Solution.3 after collecting map put it into the for each
        Map<String, Employee> minSalDeptByToMap = empList.stream()
                .collect(Collectors.toMap(
                        Employee::getDepartment,
                        Function.identity(),
                        (mp1, mp2) -> mp1.getSalary() < mp2.getSalary() ? mp1 : mp2));

        minSalDeptByToMap.forEach((dept, employee) -> {
            System.out.println(dept + ": " + employee.getSalary());
        });
        System.out.println(minSalDeptByToMap);
    }
}
