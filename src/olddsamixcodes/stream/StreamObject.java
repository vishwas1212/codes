package olddsamixcodes.stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Blank Stream
		Stream<Object> emptyStream = Stream.empty();
		emptyStream.forEach(e -> {
			System.out.println("Blank Stream " + e);
		});

		// Array of names
		String names[] = { "Ram", "Raja", "Shyam", "Vishwas" };
		Stream<String> stream1 = Stream.of(names);
		stream1.forEach(e -> {
			System.out.println(e);
		});

		// Builder Pattern

		// IntStream

		IntStream stream2 = Arrays.stream(new int[] { 2, 3, 4, 5, 6, 7, 8, 9, 10, 1 });
		stream2.forEach(e -> {
			System.out.println("Integres Of Stream " + e);
		});
	}

}
