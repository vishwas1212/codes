package olddsamixcodes.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicacyList {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
//		Integer[] darr=new Integer[arr.length];
//		System.out.println(Arrays.toString(arr));
		List al = new ArrayList<>();
		al.add(arr);
//		System.out.println(al.toString());
//		Set<Integer> hs = new HashSet(al);
////		hs.addAll(al);
//		System.out.println(hs.toString());
		
		al.stream().distinct().map(i->i).forEach(System.out::println);

		System.out.println(al.stream().distinct().collect(Collectors.toList()));

		for (int i = 0; i < al.size(); i++) {
			for (int j = i + 1; j < al.size(); j++) {

				if (al.get(i) == al.get(j)) {
					al.remove(j);
					j--;
				}
			}
		}

		System.out.println(al.toString());

	}

}
