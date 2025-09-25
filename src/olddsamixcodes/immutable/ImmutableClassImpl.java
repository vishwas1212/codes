package olddsamixcodes.immutable;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

final class ImmutableClass {

	private Integer id;
	private String name;
	private BigDecimal salary;
	private List<Address> address;

	public ImmutableClass(Integer id, String name, BigDecimal salary, List<Address> address) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	/*
	 * public List<Address> getAddress() { return address; }
	 */

	public List<Address> getAddress() throws CloneNotSupportedException {
		return new ArrayList<Address>(address);
	}

	@Override
	public String toString() {
		return "ImmutableClass [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, id, name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ImmutableClass other = (ImmutableClass) obj;
		return Objects.equals(address, other.address) && Objects.equals(id, other.id)
				&& Objects.equals(name, other.name) && Objects.equals(salary, other.salary);
	}

}

public class ImmutableClassImpl {

	public static void main(String[] args) {
		Address a1 = new Address("Ayodhya");
		Address a2 = new Address("Mathura");
		Address a3 = new Address("Nalanda");
		Address a4 = new Address("World");
		List<Address> addList = new ArrayList<>();
		addList.add(a1);
		

		ImmutableClass imp1 = new ImmutableClass(101, "Ram", new BigDecimal(10000000.00d), addList);
		ImmutableClass imp2 = new ImmutableClass(102, "Shyam", new BigDecimal(200000.00d), addList);
		ImmutableClass imp3 = new ImmutableClass(103, "Mohan", new BigDecimal(500000.00d), addList);
		ImmutableClass imp4 = new ImmutableClass(104, "Raja", new BigDecimal(400000.00d), addList);

		System.out.println(imp1);

	}

}
