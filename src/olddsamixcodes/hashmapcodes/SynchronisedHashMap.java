package olddsamixcodes.hashmapcodes;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SynchronisedHashMap {

	public static void main(String[] args) {

		HashMap<String, Integer> hashMap = new HashMap<>();

		hashMap.put("ONE", 1);

		hashMap.put("TWO", 2);

		hashMap.put("THREE", 3);

		hashMap.put("FOUR", 4);

		hashMap.put("FIVE", 5);

		Set<Entry<String, Integer>> entrySet = hashMap.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		System.out.println("-------------------------------------------");

		Map<String, Integer> synchMap = Collections.synchronizedMap(hashMap);

		Iterator iterator = synchMap.entrySet().iterator();
		while (iterator.hasNext()) {
			synchMap.put("SIX", 6);
			System.out.println(iterator.next());
		}

	}

}
