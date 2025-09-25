package olddsamixcodes.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Plurals_Stream1 {

	public static void main(String[] args) {

		/*
		 * // ways to create stream
		 */
		List<String> words = Arrays.asList(new String[] { "hello", "hola", "hallo", "ciao" });
		Stream<String> stream = words.stream();

		Stream<String> stream2 = Stream.of("hello", "hola", "hallo", "ciao");

		String words1[] = { "hello", "hola", "hallo", "ciao" };
		Stream<String> stream3 = Stream.of(words1);

		/*
		 * // Intermediate Operations always return. Intermediate operations don't
		 * process the element until a terminal operation is invoked
		 */
		Stream<String> s1 = Stream.of("m", "k", "c", "t").sorted().limit(3);

		/*
		 * // Terminal Operations always return something other than the stream // After
		 * the terminal operation is performed the stream pipeline is consumed so //
		 * can't be used anymore.
		 */
		int[] digits = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		IntStream s = IntStream.of(digits);
		long n = s.count();
		/*
		 * // System.out.println(s.findFirst());// An exception will be thrown
		 * 
		 * // If we wish to traverse the stream again we have to go back to the
		 * datasource.
		 */
		int[] digits1 = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		long n1 = IntStream.of(digits1).count();
		System.out.println(IntStream.of(digits1).findFirst()); // OK

		System.out.println();
		System.out.println("------------------------------------------------------");

		/*
		 * // Operations on the collection // The Stream interface provides the forEach
		 * method instead of using for, // for-each or iterator // forEach method does
		 * not return the stream so its a terminal method
		 */
		/*
		 * // This is not allowed // words.forEach(t -> System.out.println(t.length()));
		 * // words.forEach(System.out::println);
		 */
		/*
		 * // this is allowed // Stream.of(wordList).forEach(t ->
		 * System.out.println(t.length())); //
		 * Stream.of(wordList).forEach(System.out::println);
		 */
		Consumer<String> print = t -> {
			System.out.println(t.length());
			System.out.println(t);
		};
		words.forEach(print);

		System.out.println();
		System.out.println("------------------------------------------------------");

		/*
		 * // Using Filter
		 */
		List<String> list = Arrays.asList("Ram", "raja", null, "");
		list.stream().filter(t -> t != null).filter(t -> !t.isEmpty()).forEach(System.out::println);

		System.out.println();
		System.out.println("------------------------------------------------------");

		/*
		 * // Data Search // There are two ways of searching in the stream. // method
		 * starts with find or ends with Match
		 */
		/*
		 * // find methods search for an element in a stream. // Since there's a
		 * possibility that an element can't be found (if the stream is // empty, for
		 * example), // find methods return an Optional.
		 */
		/*
		 * // Optional<T> findAny() // Optional<T> findFirst()
		 */
		/*
		 * // match methods indicate whether a certain element matches the given
		 * predicate. // They return a boolean.
		 */
		/*
		 * // boolean allMatch(Predicate<? super T> predicate) // boolean
		 * anyMatch(Predicate<? super T> predicate) // boolean noneMatch(Predicate<?
		 * super T> predicate)
		 */
		/*
		 * Since all these methods return a type different than a stream, they are
		 * considered terminal operations.
		 */

		/* findFirst() */
		/* it will return first index value to the stream */
		IntStream stream4 = IntStream.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
		stream4.findFirst().ifPresent(System.out::println);// 0

		System.out.println();
		System.out.println("------------------------------------------------------");

		/* findAny() */
		/* it will return first index value to the stream */
		IntStream stream5 = IntStream.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
		stream5.findAny().ifPresent(System.out::println);// 0

		System.out.println();
		System.out.println("------------------------------------------------------");

		/* Again if the stream is empty they retrun false */
		Stream<String> emptyStream = Stream.empty();
		Stream<String> emptyStream1 = Stream.empty();

		boolean present = emptyStream.findFirst().isPresent();
		System.out.println(present);

		boolean present2 = emptyStream1.findAny().isPresent();
		System.out.println(present2);

		System.out.println();
		System.out.println("------------------------------------------------------");

		/** Match Methods */
		IntStream stream6 = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
		System.out.println(stream6.anyMatch(i -> i % 3 == 0));

		/*
		 * If the stream is empty or if there is no matching element, this method
		 * returns false:
		 */

		IntStream emptyStream3 = IntStream.empty();
		System.out.println(emptyStream3.anyMatch(i -> i % 3 == 0));// false

		IntStream stream7 = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
		System.out.println(stream7.anyMatch(i -> i % 113 == 0));// false

		/*
		 * allMatch() returns true only if all elements in the stream match the given
		 * predicate
		 */

		IntStream stream8 = IntStream.of(1, 2, 3, 4, 5, 6, 7);
		System.out.println(stream8.allMatch(i -> i > 0));// true

		IntStream stream9 = IntStream.of(1, 2, 3, 4, 5, 6, 7);
		System.out.println(stream9.allMatch(i -> i % 3 == 0));// false

		/*
		 * If the stream is empty, this method returns true without evaluating the
		 * predicate:
		 */

		IntStream emptyStream4 = IntStream.empty();
		System.out.println(emptyStream4.allMatch(i -> i % 3 == 0));// true

		/*
		 * noneMatch() is the opposite of allMatch(), it returns true if none of the
		 * elements in the stream match the given predicate
		 */

		IntStream stream10 = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		System.out.println(stream10.noneMatch(i -> i > 0));// false

		IntStream stream11 = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		System.out.println(stream11.noneMatch(i -> i > 3));// false

		IntStream stream12 = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		System.out.println(stream12.noneMatch(i -> i > 10));// true

		/*
		 * If the stream is empty, this method returns also true without evaluating the
		 * predicate:
		 */

		IntStream emptyStream5 = IntStream.empty();
		System.out.println(emptyStream5.noneMatch(i -> i % 3 == 0));// true

		System.out.println();
		System.out.println("------------------------------------------------------");

		/* Sorting a Stream */

		/*
		 * The method above returns a stream with the elements sorted according to their
		 * natural order
		 */

		List<Object> toSortList = Arrays.asList(12, 13, 14, 15, 16, 17, 7, 6, 5, 4, 3, 2, 1);
		toSortList.stream().sorted().forEach(System.out::println);

		List<String> toSortList1 = Arrays.asList("Stream", "Operations", "on", "Collections");
		toSortList1.stream().sorted().forEach(System.out::println);

		System.out.println();
		System.out.println("------------------------------------------------------");

		/* Data and Calculation Methods */
		/* average count max min sum */
		/*
		 * count() returns the number of elements in the stream or zero if the stream is
		 * empty:
		 */
		
		List<Integer> count1 = Arrays.asList(12,13,14,15,16);
		System.out.println(count1.stream().count());//5
		
		/*
		 * min() returns the minimum value in the stream wrapped in an Optional or an
		 * empty one if the stream is empty.
		 */
		
		/*
		 * max() returns the maximum value in the stream wrapped in an Optional or an
		 * empty one if the stream is empty.
		 */
		
		/*
		 * List<String> strings =
		 * Arrays.asList("Stream","Operations","on","Collections"); strings.stream()
		 * .min( Comparator.comparing( (String s) -> s.length())
		 * ).ifPresent(System.out::println);
		 */
		
		/*
		 * sum() returns the sum of the elements in the stream or zero if the stream is
		 * empty:
		 */
		
		System.out.println(
			    IntStream.of(28,4,91,30).sum()
			);
		
		/*
		 * average() returns the average of the elements in the stream wrapped in an
		 * OptionalDouble or an empty one if the stream is empty:
		 */
		
		System.out.println(
			    IntStream.of(28,4,91,30).average()
			);
	}

}
