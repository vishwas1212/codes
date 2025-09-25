package olddsamixcodes.demo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FindEvenMax {

	public static void main(String[] args) {
		int[] arr = { 34, 78, 33, 17, 68, 93, 57, 86, 81 };

		int max = 0;

		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i] && arr[i] % 2 == 0) {
				max = arr[i];
			}

		}
		System.out.println(max);

		List<Integer> collect = Arrays.stream(arr).boxed().collect(Collectors.toList());

		Integer integer = collect.stream().filter(i -> i % 2 == 0).sorted(Comparator.reverseOrder()).findFirst().get();
		
		System.out.println(integer);

	}

}
