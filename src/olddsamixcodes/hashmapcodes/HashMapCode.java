package olddsamixcodes.hashmapcodes;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapCode {

	public static void main(String[] args) {
//		HashMap<String, String> map = new HashMap<String, String>();
//		map.put("key1", "value1");
//		map.put("key2", "value2");
//		map.put("key3", "value3");
//
//		System.out.println("Iterating java Iterator");
//		Iterator<String> countryKeySetIterator = map.keySet().iterator();
//		while (countryKeySetIterator.hasNext()) {
//			String countryKey = countryKeySetIterator.next();
//			map.put("key4", "value4");
//			System.out.println(countryKey);
//
//		}
//		System.out.println("*****");

		ConcurrentHashMap<String, String> map = new ConcurrentHashMap<String, String>();
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");

		System.out.println("Iterating java Iterator");
		Iterator<String> concurrentKey = map.keySet().iterator();
		while (concurrentKey.hasNext()) {
			String countryKey = concurrentKey.next();
			map.put("key4", "value4");
			System.out.println(countryKey);

		}
		System.out.println("*****");

	}

}
