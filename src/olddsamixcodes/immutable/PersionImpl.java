package olddsamixcodes.immutable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Person implements Comparable<Person> {

	private int id;
	private String name;
	private String Address;
	private float salary;

	public Person() {
		super();
	}

	public Person(int id, String name, String address, float salary) {
		super();
		this.id = id;
		this.name = name;
		Address = address;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", Address=" + Address + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Person o) {
		return this.id - o.id;
	}

public static Comparator<Person> NameComparator=new Comparator<Person>() {
	
	@Override
	public int compare(Person p1, Person p2)
	{
		return p1.getName().compareTo(p2.getName());
	}
};
	public static Comparator<Person> AddressCoparator = new Comparator<Person>() {

		@Override
		public int compare(Person p1, Person p2) {
			return p1.Address.compareTo(p2.Address);
		}
	};

	public static Comparator<Person> SalaryComparator = new Comparator<Person>() {

		@Override
		public int compare(Person p1, Person p2) {
			return (int) (p1.getSalary() - p2.salary);
		}
	};

}

public class PersionImpl {

	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();

		list.add(new Person(1, "P1", "A1", 10000.0f));
		list.add(new Person(2, "P2", "A2", 20000.0f));
		list.add(new Person(3, "P3", "A3", 30000.0f));
		list.add(new Person(4, "P4", "A4", 5000.0f));
		list.add(new Person(5, "P5", "A5", 3000.0f));

		list.stream().filter(person -> person.getSalary() > 10000).map(p -> p.getName()).collect(Collectors.toList())
				.forEach(System.out::println);

		Person[] person = new Person[6];
		person[0] = new Person(8,  "P1", "A1", 10000.0f);
		person[1] = new Person(6,  "P6", "A6", 10000.0f);
		person[2] = new Person(4,  "P2", "A2", 20000.0f);
		person[3] = new Person(22, "P3", "A3", 30000.0f);
		person[4] = new Person(54, "P4", "A4", 5000.0f);
		person[5] = new Person(12, "P5", "A5", 3000.0f);

		Arrays.sort(person);
		System.out.println(Arrays.toString(person));

		Arrays.sort(person, Person.NameComparator);
		System.out.println(Arrays.toString(person));

		Arrays.sort(person, Person.AddressCoparator);
		System.out.println(Arrays.toString(person));

		Arrays.sort(person, Person.SalaryComparator);
		System.out.println(Arrays.toString(person));

	}

}
