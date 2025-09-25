package olddsamixcodes.hashmapcodes;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapAddKeyValue {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<>();

		map.put("ONE", 1);

		map.put("TWO", 2);

		map.put("THREE", 3);

		map.put("FOUR", 4);

		map.put("FIVE", 5);

		for (Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}

}
