package olddsamixcodes.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ListWithStream {

	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<Employee>();

		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Jiya Brein", 32, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Jiya Brein", 32, "Female", "HR", 2013, 22700.0));

		List list = employeeList.stream().filter(e -> e.getSalary() > 20000).collect(Collectors.toList());
		
		List list1 = employeeList.stream().filter(e -> e.getSalary() > 20000).map(e->e.getAge()+10).toList();
		System.out.println(list1.toString());

		Optional<Employee> emp = employeeList.stream()
				.sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(0).findFirst();

		String min = employeeList.stream().collect(Collectors.minBy(Comparator.comparingDouble(Employee::getSalary)))
				.map(e->e.getName()).get();
		Employee max = employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)))
				.get();

		Double collect = employeeList.stream().collect(Collectors.averagingDouble(Employee::getSalary));
		System.out.println(collect);
		
		double asDouble = employeeList.stream().mapToDouble(Employee::getSalary).average().getAsDouble();
		
		System.out.println(asDouble);
		
		System.out.println(min);
		System.out.println(max);

		System.out.println(emp.get());
		
		System.out.println("----------------------------------------------------------------------------------");

		employeeList.stream().sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getYearOfJoining))
				.forEach(System.out::println);
		
		List dlist=Arrays.asList(1,2,2,5,5,3,3,1,4,5,4,4,4,4,5,6,2,2);
		
		dlist.stream().distinct().sorted().forEach(System.out::println);
		
		System.out.println(dlist.stream().collect(Collectors.toSet()));

	}
}
