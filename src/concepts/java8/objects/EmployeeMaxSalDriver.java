package concepts.java8.objects;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeeMaxSalDriver {
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

        //Solution 1 find the sal with values
        Map<String, Long> maxSalDeptValues = empList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparingLong(Employee::getSalary)),
                                opt -> opt.map(Employee::getSalary).orElse(0l))));
        System.out.println(maxSalDeptValues);
        System.out.println("------------------------------");
        Map<String, Optional<Employee>> maxSalDeptEmp = empList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.maxBy(Comparator.comparingLong(Employee::getSalary))));

        maxSalDeptEmp.forEach((dept, employee) -> {
            Long salary = employee.map(Employee::getSalary).orElse((0L));
            String name = employee.map(Employee::getName).orElse("N/A");
            System.out.println("Dept: " + dept + " Salary: "+salary + " Name: " + name);
        });
        System.out.println("-------------------------------");
        Map<String, Employee> maxSalDeptMap = empList.stream()
                .collect(Collectors.toMap(Employee::getDepartment,
                        Function.identity(),
                        (mp1, mp2) -> mp1.getSalary() > mp2.getSalary() ? mp1 : mp2));
        maxSalDeptMap.forEach((s, employee) -> {
            System.out.println(s + ": " + employee.getSalary() + " Employee Name: " + employee.getName());
        });
    }
}
