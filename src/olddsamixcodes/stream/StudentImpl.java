package olddsamixcodes.stream;

import java.util.ArrayList;
import java.util.*;
import java.util.stream.Collectors;

class Student {

	private String name;
	private int gradeLevel;
	private double gpa;
	private String gender;
	List<String> activities;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int gradeLevel, double gpa, String gender, List<String> activities) {
		super();
		this.name = name;
		this.gradeLevel = gradeLevel;
		this.gpa = gpa;
		this.gender = gender;
		this.activities = activities;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGradeLevel() {
		return gradeLevel;
	}

	public void setGradeLevel(int gradeLevel) {
		this.gradeLevel = gradeLevel;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<String> getActivities() {
		return activities;
	}

	public void setActivities(List<String> activities) {
		this.activities = activities;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", gradeLevel=" + gradeLevel + ", gpa=" + gpa + ", gender=" + gender + "]";
	}

}

public class StudentImpl {

	public static void main(String[] args) {
		// names in uppercase of all female students with gpa > 4

		List<String> activities1 = new ArrayList<String>();
		activities1.add("Dancing");
		activities1.add("Singing");
		activities1.add("Painting");
		activities1.add("Flueting");

		Student s1 = new Student("sita", 5, 12, "female", activities1);

		List<String> activities2 = new ArrayList<String>();
		activities2.add("Dancing");
		activities2.add("Singing");
		activities2.add("Playing");
		activities2.add("Running");

		Student s2 = new Student("gita", 5, 6, "female", activities2);

		List<String> activities3 = new ArrayList<String>();
		activities3.add("Dancing");
		activities3.add("Singing");

		Student s3 = new Student("susheela", 5, 6, "female", activities3);

		List<String> activities4 = new ArrayList<String>();
		activities4.add("Dancing");
		activities4.add("Singing");
		activities4.add("Throwing");

		Student s4 = new Student("rita", 5, 3, "female", activities4);

		List<String> activities5 = new ArrayList<String>();
		activities5.add("Dancing");
		activities5.add("Singing");
		activities5.add("Painting");
		activities5.add("Flueting");

		Student s5 = new Student("soniya", 5, 2, "female", activities5);

		List<Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);

		List<String> listOfNames = list.stream()
				.filter(student -> student.getGpa() > 4 && student.getGender().equals("female"))
				.map(name -> name.getName().toUpperCase()).collect(Collectors.toList());

		System.out.println(listOfNames);

		String names = list.stream().filter(student -> student.getGpa() > 4 && student.getGender().equals("female"))
				.map(name -> name.getName().toUpperCase()).findAny().get();

		System.out.println(names);

		Set<String> nameByFlatMap = list.stream().flatMap(name -> name.getActivities().stream())
				.collect(Collectors.toSet());

		System.out.println(nameByFlatMap);

		list.stream().map(name -> name.getName().toUpperCase()).forEach(System.out::println);

	}

}
