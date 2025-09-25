package olddsamixcodes.hashmapcodes;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class KeyWithMaxValues {

	public static void main(String[] args) {

		Map<String, Integer> countMap = new HashMap<>();
		countMap.put("ABC", 23);
		countMap.put("XYZ", 12);
		countMap.put("DEF", 45);
		countMap.put("HIG", 12);
		countMap.put("AKL", 14);
		countMap.put("FED", 45);
		countMap.put("ZXC", 45);

		Map.Entry<String, Integer> maxEntry = null;

		for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
			if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
				maxEntry = entry;
			}
		}
		System.out.println(maxEntry.getKey());

		String key = countMap.entrySet().stream()
				.max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getKey();

		System.out.println(key);

		String key2 = Collections.max(countMap.entrySet(), (entry1, entry2) -> entry1.getValue() - entry2.getValue())
				.getKey();

		System.out.println(key2);

		String key3 = Collections.max(countMap.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getKey();

		System.out.println(key3);

	}

}
