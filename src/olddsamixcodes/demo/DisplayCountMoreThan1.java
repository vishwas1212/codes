package olddsamixcodes.demo;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class DisplayCountMoreThan1 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(5, 3, 2, 1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 1, 9, 1, 2, 1, 12);

		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();

		for (int i = 0; i < list.size(); i++) {
			map.put(list.get(i), map.getOrDefault(list.get(i), 0) + 1);
		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

			Integer count = entry.getValue();
			if (count >= 2) {
				System.out.print(entry.getKey()+" ");
			}

		}
		System.out.println();

		List<String> stringList = Arrays.asList("aaaa", "bbbb", "caccc", "adddd", "fffff", "Azzzz", "gaaaaa");

		stringList.stream().filter(e -> e.startsWith("a") || e.startsWith("A")).forEach(System.out::println);

		String s = "abc";
		findSequence(s, "");

	}

	private static void findSequence(String s, String string) {

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			String res = s.substring(0, i) + s.substring(i + 1);
			findSequence(res, string + ch);
		}

		if (string.length() > 2)
			System.out.println(string);

	}

}
