package olddsamixcodes.hashmapcodes;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapOperWhileIteration {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");

		System.out.println("Iterating java Iterator");
		Iterator<String> countryKeySetIterator = map.keySet().iterator();
		while (countryKeySetIterator.hasNext()) {
			String countryKey = countryKeySetIterator.next();
			System.out.println(map.get("key1"));
			System.out.println(countryKey);

		}
		System.out.println("*****");
	}

}
