package olddsamixcodes.immutable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class Location implements Cloneable {

	public String locationType;
	public String location;
	public String city;

	public Location(String locationType, String location, String city) {
		super();
		this.locationType = locationType;
		this.location = location;
		this.city = city;
	}

	public String getLocationType() {
		return locationType;
	}

	public void setLocationType(String locationType) {
		this.locationType = locationType;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();

	}

	@Override
	public String toString() {
		return "Location [locationType=" + locationType + ", location=" + location + ", city=" + city + "]";
	}

}

final class People implements Comparable<People> {

	private final Integer id;
	private final String name;
	private final Date date;
	private final Location location;

	public People(Integer id, String name, Date date, Location location) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.location = location;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Date getDate() {
		Date date = new Date();
		date.setTime(date.getTime());
		return date;
	}

	public Location getLocation() throws CloneNotSupportedException {
		return (Location) location.clone();
	}

	@Override
	public String toString() {
		return "People [id=" + id + ", name=" + name + ", date=" + date + ", location=" + location + "]";
	}

	@Override
	public int compareTo(People o) {

		return this.id - o.id;
	}

	public static Comparator<People> IdComparator = new Comparator<People>() {

		@Override
		public int compare(People o1, People o2) {

			return o1.compareTo(o2);
		}

	};

	public static Comparator<People> NameComparator = new Comparator<People>() {

		@Override
		public int compare(People o1, People o2) {

			return o1.getName().compareTo(o2.getName());
		}

	};

	public static Comparator<People> DateComparator = new Comparator<People>() {

		@Override
		public int compare(People o1, People o2) {

			return o1.date.compareTo(o2.date);
		}

	};

}

public class ImmutableImpl {

	public static void main(String[] args) throws CloneNotSupportedException {

		People people = new People(1, "RamRaja", new Date(), new Location("Ayodhya", "UP", "AyodhyaCity"));
		Location location = people.getLocation();
		Date date = people.getDate();
//		System.out.println(location + " " + date);
		location.setCity("MathuraCity");
		location.setLocationType("Mathura");
		location.setLocation("UP");
		date.setTime(10L);
//		System.out.println(people.getLocation() + " " + people.getDate());

		People people1 = new People(2, "Krishna", new Date(), new Location("Mathura", "UP", "MathuraCity"));
		People people2 = new People(3, "Shiva", new Date(), new Location("Kailash", "Himalaya", "Nepa"));
		People people3 = new People(4, "Vishnu", new Date(), new Location("Vaikunthpuram", "Treelok", "Sheshnag"));
		People people4 = new People(5, "Brahma", new Date(), new Location("Lotus", "Sheshnaag", "Samudra"));
		People people5 = new People(6, "Hanuman", new Date(), new Location("Aanjenya", "Karnatak", "AanjenyaParvat"));

		List<People> peoples = new ArrayList<>();
		peoples.add(people);
		peoples.add(people1);
		peoples.add(people2);
		peoples.add(people3);
		peoples.add(people4);
		peoples.add(people5);

//		System.out.println(peoples);

		Map<Integer, People> map = peoples.stream().collect(Collectors.toMap(People::getId, Function.identity()));
//		System.out.println(map);

		Date date1 = new GregorianCalendar(2014, Calendar.FEBRUARY, 11).getTime();
		Date date2 = new GregorianCalendar(2014, Calendar.DECEMBER, 11).getTime();
		Date date3 = new GregorianCalendar(2014, Calendar.JULY, 11).getTime();
		Date date4 = new GregorianCalendar(2014, Calendar.OCTOBER, 11).getTime();

		People[] peopleArray = new People[4];
		peopleArray[0] = new People(10, "P7", date1, location);
		peopleArray[1] = new People(9, "P8", date2, location);
		peopleArray[2] = new People(8, "P9", date3, location);
		peopleArray[3] = new People(7, "P10", date4, location);

//		Arrays.sort(peopleArray);
//		System.out.println(Arrays.toString(peopleArray));

		Arrays.sort(peopleArray, People.IdComparator);
		System.out.println(Arrays.toString(peopleArray));

		Arrays.sort(peopleArray, People.NameComparator);
		System.out.println(Arrays.toString(peopleArray));

		Arrays.sort(peopleArray, People.DateComparator);
		System.out.println(Arrays.toString(peopleArray));
	}

}
