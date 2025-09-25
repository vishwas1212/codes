package olddsamixcodes.hashmapcodes;

import java.util.Collection;
import java.util.HashMap;

public class RetrieveValues {

	public static void main(String[] args) {

		HashMap<String, Integer> hashMap = new HashMap<>();

		hashMap.put("ONE", 1);

		hashMap.put("TWO", 2);

		hashMap.put("THREE", 3);

		hashMap.put("FOUR", 4);

		hashMap.put("FIVE", 5);

		Collection<Integer> values = hashMap.values();

		for (Integer value : values) {
			System.out.println(value);
		}

	}

}
