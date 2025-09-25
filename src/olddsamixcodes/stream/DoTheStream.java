package olddsamixcodes.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DoTheStream {

	public static void main(String[] args) {

		List<Integer> list1 = List.of(2, 3, 4, 5, 6, 7, 12, 13, 14, 15, 16);
		// Without Stream Api
		List<Integer> listEven = new ArrayList<>();
		Integer j = 0;
		for (Integer i : list1) {
			if (i % 2 == 0) {
				listEven.add(i);
				j = j + i;
			}
		}
		System.out.println("Before Filter List " + list1);
		System.out.println("After Filter List " + listEven);
		System.out.println("Sum of The even list " + j);

		// With Stream Api
		Stream<Integer> stream = list1.stream();
		List<Integer> newEvenList = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println("Filtered with Stream " + newEvenList);

		List<Integer> newEvenList1 = list1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println("Filtered 1 with Stream " + newEvenList1);
		
	List<Integer> greaterThan2 = list1.stream().filter(i->i>10).collect(Collectors.toList());
	System.out.println("Greater than 2 "+ greaterThan2);
	}

}
