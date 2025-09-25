package olddsamixcodes.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class User {

	private String name;
	private String address;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", address=" + address + "]";
	}

}

public class UserImpl {

	public static void main(String[] args) {

		List<User> listOfUsers = new ArrayList<User>();
		listOfUsers.add(new User("Ram", "Ayodhya"));
		listOfUsers.add(new User("Shyam", "Mathura"));
		listOfUsers.add(new User("Mahadev", "Kailash"));
		listOfUsers.add(new User("Vishnu", "Vaikunthpur"));
		listOfUsers.add(new User("Vishwas", "Bharat"));
		listOfUsers.add(new User("Singham", "Bharat"));
		listOfUsers.add(new User("Raja", "Bharat"));

		System.out.println(listOfUsers);

		System.out.println(
				"----------Obtain Bharat and Non Bharat based users using paratiningBy and groupingBY and map-----------");

		System.out
				.println(listOfUsers.stream().collect(Collectors.partitioningBy(u -> u.getAddress().equals("Bharat"))));

		System.out.println(listOfUsers.stream().collect(Collectors.groupingBy(u -> u.getAddress().equals("Bharat"))));

		listOfUsers.stream().filter(u -> u.getAddress().equals("Bharat")).map(u -> u.getName())
				.forEach(System.out::println);
		System.out.println(
				"----------Count Bharat and Non Bharat based users using paratiningBy and groupingBY and map------------");

		System.out.println(listOfUsers.stream()
				.collect(Collectors.partitioningBy(u -> u.getAddress().equals("Bharat"), Collectors.counting())));
		System.out.println(listOfUsers.stream()
				.collect(Collectors.groupingBy(u -> u.getAddress().equals("Bharat"), Collectors.counting())));

		System.out.println("----------Obtain the name in each address and count them by using groupingBy------------");

		System.out.println(listOfUsers.stream().collect(Collectors.groupingBy(u -> u.getAddress())));
		System.out.println(
				listOfUsers.stream().collect(Collectors.groupingBy(u -> u.getAddress(), Collectors.counting())));

		System.out.println(
				"----------Obtain the name in each address and count them by using partioningBy amd map names in uppercase------------");

		System.out.println(listOfUsers.stream().collect(Collectors.partitioningBy(u -> u.getAddress().equals("Bharat"),
				Collectors.mapping(u -> u.getName().toUpperCase(), Collectors.toList()))));

		System.out.println(
				"----------Obtain the name in each address and count them by using groupingBy amd map names in uppercase------------");

		System.out.println(listOfUsers.stream().collect(Collectors.groupingBy(u -> u.getAddress().equals("Bharat"),
				Collectors.mapping(u -> u.getName().toUpperCase(), Collectors.toList()))));

	}

}
