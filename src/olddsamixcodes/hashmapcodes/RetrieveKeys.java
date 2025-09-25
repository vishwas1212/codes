package olddsamixcodes.hashmapcodes;

import java.util.HashMap;
import java.util.Set;

public class RetrieveKeys {

	public static void main(String[] args) {

		HashMap<String, Integer> hashMap = new HashMap<>();

		hashMap.put("ONE", 1);

		hashMap.put("TWO", 2);

		hashMap.put("THREE", 3);

		hashMap.put("FOUR", 4);

		hashMap.put("FIVE", 5);

		Set<String> keys = hashMap.keySet();

		for (String key : keys) {
			System.out.println(key);
		}

	}

}
