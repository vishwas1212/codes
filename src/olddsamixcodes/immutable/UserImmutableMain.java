package olddsamixcodes.immutable;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class UserImmutableMain {

	public static void main(String[] args) {

		UserAddress address1 = new UserAddress();
		address1.setAddressLine1("addressline1");
		address1.setAddressLine2("addressline2");
		address1.setCity("Patna");

		UserAddress address2 = new UserAddress();
		address2.setAddressLine1("addressline1");
		address2.setAddressLine2("addressline2");
		address2.setCity("Nalanda");

		List<String> list = new ArrayList<>();
		list.add("Java");
		list.add("Spring");
		list.add("Microservices");

		User u1 = new User(1001, "KK", new BigDecimal("90000.00"), new Date("04/02/1986"), address1, list);
		User u2 = new User(1002, "Sean", new BigDecimal("40000.00"), new Date("25/02/1985"), address2, list);
		User u3 = new User(1003, "KK", new BigDecimal("60000.00"), new Date("14/03/1985"), address1, list);
		User u4 = new User(1004, "KK", new BigDecimal("95000.00"), new Date("15/12/1986"), address2, list);

		ConcurrentHashMap<User, String> userMap = new ConcurrentHashMap<>();
		userMap.put(u1, "IT");
		userMap.put(u2, "Finance");
		userMap.put(u3, "Admin");
		userMap.put(u4, "HR");

		Set<Entry<User, String>> entrySet = userMap.entrySet();

		for (Entry<User, String> entry : entrySet) {
			User user = entry.getKey();
			String dept = entry.getValue();
			System.out.println(user);
			System.out.println(dept);

		}

		System.out.println("-------------------------------------------------------------");
		u1.getDob().setTime(897874841513221l);
		System.out.println(u1);
		System.out.println(userMap.get(u1));

		System.out.println("--------------------------------------------------------------------");
		System.out.println(u1);
		System.out.println(u2);
		System.out.println("----------------------------------------------------------------------");

		u1.getAddress().setCity("Nawada");
		u1.getSkills().add("Python");
		System.out.println(u1);
	}

}
