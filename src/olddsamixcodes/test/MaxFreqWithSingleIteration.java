package olddsamixcodes.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class MaxFreqWithSingleIteration {

	public static void main(String[] args) {

		String[] arr = { "1", "1", "1", "1", "1", "1", "5", "5", "12", "12", "12", "12", "12", "12", "12", "12", "12",
				"12", "8" };

		Integer integer2 = Arrays.stream(arr).map(Integer::parseInt).collect(Collectors.groupingBy(i->i,Collectors.counting()))
		.keySet().stream().collect(Collectors.maxBy(Comparator.comparingInt(i -> i))).orElseThrow(RuntimeException::new);

		System.out.println(integer2);

		int[] arr1 = { 1, 1, 1, 1, 1, 1, 5, 5, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 8 };

		Integer integer = Arrays.stream(arr1).boxed().collect(Collectors.groupingBy(i -> i, Collectors.counting())).keySet().stream()
				.collect(Collectors.maxBy(Comparator.comparingInt(i -> i))).orElseThrow(RuntimeException::new);
		
		System.out.println(integer);

	}

}
