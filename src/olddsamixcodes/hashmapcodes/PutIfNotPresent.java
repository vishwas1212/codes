package olddsamixcodes.hashmapcodes;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class PutIfNotPresent {

	public static void main(String[] args) {

		HashMap<String, Integer> hashMap = new HashMap<>();

		hashMap.put("ONE", 1);

		hashMap.put("TWO", 2);

		hashMap.put("THREE", 3);

		hashMap.put("FOUR", 4);

		hashMap.put("FIVE", 5);

		hashMap.putIfAbsent("ONE", 11);

		Set<Entry<String, Integer>> entrySet = hashMap.entrySet();

		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}

}
