package olddsamixcodes.immutable;

import java.util.Date;
import java.util.HashMap;
import java.util.Objects;
import java.util.Map.Entry;

public final class Employee implements Comparable<Employee>{

	private final int empId;
	private final String empName;
	private final Date doj;

	public Employee(int empId, String empName, Date doj) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.doj = doj;
	}

	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public Date getDoj() {
		Date date = new Date();
		date.setTime(doj.getTime());
		return date;
	}

	@Override
	public int hashCode() {
		return Objects.hash(empId, empName, doj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(empId, other.empId) && Objects.equals(empName, other.empName)
				&& Objects.equals(doj, other.doj);
	}
	
	@Override
	public int compareTo(Employee e) {
		
		return this.empId-e.empId;
	}

	@Override
	public String toString() {
		return empId + "-" + empName + "-" + doj + "]";
	}

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "abc", new Date());
		Employee e2 = new Employee(2, "abc", new Date());
		Employee e3 = new Employee(3, "abc", new Date());
		Employee e4 = new Employee(4, "abc", new Date());
		Employee e5 = new Employee(5, "abc", new Date());

		HashMap<Employee, Integer> map = new HashMap<>();
		map.put(e1, 300);
		map.put(e2, 200);
		map.put(e3, 400);
		map.put(e4, 400);
		map.put(e5, 500);

		map.entrySet().stream().sorted(Entry.comparingByValue()).forEach(System.out::println);
	}

	

}
