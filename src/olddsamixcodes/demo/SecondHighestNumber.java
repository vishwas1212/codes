package olddsamixcodes.demo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondHighestNumber {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 11, 6, 7, 8 };
		int max = 0;
		int minSub = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			int temp = max - arr[i];
			if (temp < minSub) {
				
			}
		}

		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		Integer secondMax = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();

		System.out.println(secondMax);

	}

}
