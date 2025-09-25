package olddsamixcodes.hashmapcodes;

import java.util.HashMap;

public class KeyValuePresent {

	public static void main(String[] args) {

		HashMap<String, Integer> hashMap = new HashMap<>();

		hashMap.put("ONE", 1);

		hashMap.put("TWO", 2);

		hashMap.put("THREE", 3);

		hashMap.put("FOUR", 4);

		hashMap.put("FIVE", 5);

		System.out.println(hashMap.containsKey("ONE"));
		System.out.println(hashMap.containsValue(7));

	}

}
