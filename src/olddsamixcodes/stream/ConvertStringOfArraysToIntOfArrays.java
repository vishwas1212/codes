package olddsamixcodes.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ConvertStringOfArraysToIntOfArrays {

	public static void main(String[] args) {

		String[] arr = new String[] { "100", "200", "121", "13", "12" };

		List<Integer> list = Arrays.stream(arr).map(Integer::parseInt).collect(Collectors.toList());

		System.out.println(list);

		list.stream().map(i -> i * i).filter(i -> i > 1000).forEach(System.out::println);

		int[] arr12 = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arr12[i] = Integer.parseInt(arr[i]);
		}
		System.out.println(Arrays.toString(arr12));
		List<Integer> list1 = IntStream.of(arr12).boxed().toList();
		list1.stream().map(i -> i * i).filter(i -> i > 1000 && i % 2 == 0).forEach(System.out::println);

		list1.stream().map(i -> i + i).forEach(System.out::println);

	}

}
