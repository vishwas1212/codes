package olddsamixcodes.immutable;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public final class User {

	private final Integer id;
	private final String name;
	private final BigDecimal salary;
	private final Date dob;
	private final UserAddress address;
	private final List<String> skills;

	public User(Integer id, String name, BigDecimal salary, Date dob, UserAddress address, List<String> skills) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dob = dob;
		this.address = address;
		this.skills = skills;
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

	public Date getDob() {
		return new Date(dob.getTime());
	}

	public UserAddress getAddress() {
		UserAddress address = new UserAddress();
		address.setAddressLine1(address.getAddressLine1());
		address.setAddressLine2(address.getAddressLine2());
		address.setCity(address.getCity());
		return address;
	}

	public List<String> getSkills() {
		return new ArrayList<String>(skills);
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, dob, id, name, salary, skills);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(address, other.address) && Objects.equals(dob, other.dob) && Objects.equals(id, other.id)
				&& Objects.equals(name, other.name) && Objects.equals(salary, other.salary)
				&& Objects.equals(skills, other.skills);
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", salary=" + salary + ", dob=" + dob + ", address=" + address
				+ ", skills=" + skills + "]";
	}

}
