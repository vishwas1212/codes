package olddsamixcodes.demo;

import java.util.List;

public class CloneablePerson implements Cloneable {

	private int id;
	private String name;
	private Long salary;
	private CloneableAddress address;
	private List<String> list;

	public CloneablePerson(int id, String name, Long salary, CloneableAddress address, List<String> list) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
		this.list = list;
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

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

	public CloneableAddress getAddress() {
		return address;
	}

	public void setAddress(CloneableAddress address) {
		this.address = address;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "CloneablePerson [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address
				+ ", list=" + list + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		CloneablePerson person = (CloneablePerson) super.clone();
		person.setAddress(new CloneableAddress(getAddress().getAddressId(), getAddress().getCountry(),
				getAddress().getCity(), getAddress().getZipcode()));

		return person;
	}

}
