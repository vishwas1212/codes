package olddsamixcodes.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

class Employee1 {

	private Integer id;
	private String name;

	public Employee1(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee1 other = (Employee1) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}
	
	

}

public class HashmapExercise {

	public static void main(String[] args) {

		Map<Employee1, String> hm = new HashMap<>();

		Employee1 e1 = new Employee1(1, "Vishwas");
		Employee1 e2 = new Employee1(2, "Sagar");
		Employee1 e3 = new Employee1(3, "Vishwas");
		
		List<Employee1> emplList=new ArrayList<>();
		emplList.add(e1);
		emplList.add(e2);
		emplList.add(e3);
		
		System.out.println(emplList);
		Map<Integer, String> map=emplList.stream().collect(Collectors.toMap(Employee1::getId, Employee1::getName));
		System.out.println(map.toString());

		hm.put(e1, "dummy1");
		hm.put(e2, "dummy2");
		hm.put(e3, "dummy3");

		System.out.println(hm.toString());

	}

}
