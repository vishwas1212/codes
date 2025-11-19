package demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Employee {

    String name;
    Integer salary;
    String Department;

    public Employee(String name, Integer salary, String department) {
        this.name = name;
        this.salary = salary;
        Department = department;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", Department='" + Department + '\'' +
                '}';
    }

    static void main() {
        Employee e1 = new Employee("Ram", 10000, "HR");
        Employee e2 = new Employee("Shyam", 10000, "HR");
        Employee e3 = new Employee("Mohan", 11000, "IT");
        Employee e4 = new Employee("Shiva", 20000, "HR");
        Employee e5 = new Employee("Krishna", 30000, "IT");
        Employee e6 = new Employee("Lakhsman", 23000, "HR");
        Employee e7 = new Employee("Bharat", 15000, "HR");
        Employee e8 = new Employee("Hanuman", 34000, "IT");
        Employee e9 = new Employee("Ram", 34000, "IT");
        Employee e10 = new Employee("Vibhshan", 12000, "IT");

        List<Employee> list = List.of(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10);

        List<Integer> sortedSalary = list.stream().filter(e -> e.getDepartment()
                        .equalsIgnoreCase("hr")).map(Employee::getSalary)
                .distinct()
                .sorted(Comparator.reverseOrder()).toList();

        Integer nthHighestSalary = sortedSalary.get(4 - 1);

        List<Employee> employees = list.stream()
                .filter(e -> e.getDepartment().equalsIgnoreCase("hr"))
                .filter(e -> e.getSalary().equals(nthHighestSalary))
                .collect(Collectors.toList());
        System.out.println(employees);
    }
}
