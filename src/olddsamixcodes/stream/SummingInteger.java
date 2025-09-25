package olddsamixcodes.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SummingInteger {

	public static void main(String[] args) {
		String[] arr = { "1", "2", "3", "4", "5" };

		List<Integer> list = Arrays.stream(arr).map(Integer::parseInt).collect(Collectors.toList());

		System.out.println(list);

		System.out.println(list.stream().collect(Collectors.summarizingInt(Integer::intValue)));

		System.out.println(list);

		System.out.println(list.stream().collect(Collectors.summingInt(Integer::intValue)));
		System.out.println(list);

		System.out.println(list.stream().mapToInt(i -> i).sum());
		System.out.println(list);

		System.out.println(list.stream().map(i -> i).reduce(0, Integer::sum));
		System.out.println(list);

		System.out.println(list.stream().map(i -> i).reduce(0, (a, b) -> a + b));
		System.out.println(list);

	}

}
