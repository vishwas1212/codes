package olddsamixcodes.demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employee {

	private String id;
	private int salary;

	public Employee(String id, int salary) {
		super();
		this.id = id;
		this.salary = salary;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + "]";
	}

}

public class Demo {

	public static void main(String[] args) {

		Employee a1 = new Employee("7", 43500);
		Employee a2 = new Employee("1", 2000);
		Employee a3 = new Employee("2", 20000);
		Employee a4 = new Employee("3", 30000);
		Employee a5 = new Employee("4", 22000);
		Employee a6 = new Employee("5", 32000);
		Employee a7 = new Employee("6", 15000);
		
		List<Employee> empList = new ArrayList<>();
		
		empList.add(a1);
		empList.add(a2);
		empList.add(a3);
		empList.add(a4);
		empList.add(a5);
		empList.add(a6);
		empList.add(a7);
		
		Employee employee = empList.stream().collect(Collectors.maxBy(Comparator.comparingInt(Employee::getSalary))).get();
		System.out.println(employee);

	}

}
