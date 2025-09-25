package olddsamixcodes.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JumbledWords {

	public static void main(String[] args) {

		List<String> words = Arrays.asList("aps", "tk", "mno", "omn", "spa", "spaa", "a", "onm");
		Set<Set<String>> anagrams = groupOfAnagrams(words);
		System.out.println(anagrams);
		for (Set<String> anagram : anagrams) {
			System.out.println(anagram);
		}

	}

	private static Set<Set<String>> groupOfAnagrams(List<String> words) {
		Set<Set<String>> anagrams = new HashSet<Set<String>>();
		if (words == null) {
			return anagrams;
		}

		List<String> list = words.stream().map(s -> Stream.of(s.split("")).sorted().collect(Collectors.joining()))
				.collect(Collectors.toList());
		Map<String, List<Integer>> map = new HashMap<String, List<Integer>>();

		for (int i = 0; i < list.size(); i++) {
			map.putIfAbsent(list.get(i), new ArrayList<>());
			map.get(list.get(i)).add(i);
		}

		for (var entry : map.entrySet()) {
			Set<String> collection = entry.getValue().stream().map(i -> words.get(i)).collect(Collectors.toSet());
			if (collection.size() == 1 || collection.size() > 1) {
				anagrams.add(collection);
			}
		}

		return anagrams;
	}

}
