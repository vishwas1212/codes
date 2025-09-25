package olddsamixcodes.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Book {
	private Integer id;
	private String name;
	private Integer pages;
	private String author;
	private Double cost;

	public Book() {
		super();
	}

	public Book(Integer id, String name, Integer pages, String author, Double cost) {
		super();
		this.id = id;
		this.name = name;
		this.pages = pages;
		this.author = author;
		this.cost = cost;
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

	public Integer getPages() {
		return pages;
	}

	public void setPages(Integer pages) {
		this.pages = pages;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", pages=" + pages + ", author=" + author + ", cost=" + cost + "]";
	}

}

public class SortListByTwoFields {

	public static void main(String[] args) {
		List<Book> bookList = new ArrayList<>();
		bookList.add(new Book(511, "Core Java", 200, "Kathy Sierra", 1065.5));
		bookList.add(new Book(511, "Core Java", 100, "Kathy Sierra", 1749.0));
		bookList.add(new Book(502, "Spring in Action", 480, "Craig Walls", 940.75));
		bookList.add(new Book(503, "Pro Angular", 260, "Freeman", 1949.25));
		bookList.add(new Book(504, "Core Java", 100, "Kathy Sierra", 2317.09));
		bookList.add(new Book(505, "Hibernate in Action", 180, "Gavin King", 889.25));

		System.out.println("Sort List of Book objects by BookName");
		System.out.println();

		bookList.stream().filter(i -> i.getPages() > 200).collect(Collectors.toList()).forEach(System.out::println);
		System.out.println();
		bookList.stream().sorted(Comparator.comparing(Book::getName)).forEach(System.out::println);

		System.out.println("---------------------------------------------------------");
		System.out.println();
		System.out.println("Sort List of Book objects by BookName if same then sort by id");
		System.out.println();

		bookList.stream().sorted(Comparator.comparing(Book::getName).thenComparingInt(Book::getId)
				.thenComparingDouble(Book::getCost).thenComparing(Book::getAuthor).thenComparingLong(Book::getPages))
				.forEach(System.out::println);
	}

}
