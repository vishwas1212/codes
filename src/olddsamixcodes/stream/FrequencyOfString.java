package olddsamixcodes.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfString {

	public static void main(String[] args) {

		System.out.println("-------------------List of Strings Counting--------------------");

		List<String> words = Arrays.asList("hello", "hello", "mighty");

		LinkedHashMap<String, Long> linkedHashMap = words.stream()
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

		System.out.println(linkedHashMap.toString());

		System.out.println("---------------------Character Array Counting--------------------");

		Character[] letters = { 'a', 'b', 'b', 'c', 'c', 'c' };

		LinkedHashMap<Character, Long> linkedHashMap2 = Arrays.stream(letters)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

		System.out.println(linkedHashMap2.toString());

		System.out.println("---------------------Character Of String Counting--------------------");

		String str = "RAM";

		LinkedHashMap<Character, Long> linkedHashMap3 = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

		System.out.println(linkedHashMap3.toString());

		System.out.println("---------------------Integer Array Counting--------------------");

		int[] numbers = { 1, 2, 2, 2, 3, 3 };

		LinkedHashMap<Integer, Long> linkedHashMap4 = Arrays.stream(numbers).boxed()
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

		System.out.println(linkedHashMap4.toString());

		System.out.println("---------------------Print first Repeating Character--------------------");

		String str1 = "vishwas vimal";

		LinkedHashMap<Character, Long> linkedHashMap5 = str1.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

		System.out.println(linkedHashMap5.toString());
		Character character = linkedHashMap5.entrySet().stream().filter(i -> i.getValue() > 1).map(i -> i.getKey())
				.skip(2).findFirst().get();

		System.out.println(character);

		System.out.println("---------------------Print first Repeating Character without spaces--------------------");

		String string = str1.replaceAll("\s", "");
		System.out.println(string);
		LinkedHashMap<Character, Long> linkedHashMap6 = string.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

		System.out.println(linkedHashMap6.toString());
		Character character2 = linkedHashMap6.entrySet().stream().filter(v -> v.getValue() > 1).map(k -> k.getKey())
				.skip(2).findFirst().get();
		System.out.println(character2);

		String str12 = "vishwas";
		LinkedHashMap<Character, Long> linkedHashMap7 = str12.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

		System.out.println(linkedHashMap7);
		Character character3 = linkedHashMap7.entrySet().stream().filter(i -> i.getValue() == 1).map(i -> i.getKey())
				.skip(0).findFirst().get();

		
		Character key = Collections.max(linkedHashMap7.entrySet(), Comparator.comparingLong(Map.Entry::getValue)).getKey();
		
		System.out.println(key);
	}

}
