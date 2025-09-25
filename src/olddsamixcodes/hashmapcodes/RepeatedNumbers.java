package olddsamixcodes.hashmapcodes;

import java.util.HashMap;

public class RepeatedNumbers {

	public static void main(String[] args) {

		int[] arr = { 2, 3, 2, 3, 4, 1, 1, 2, 1, 3, 1, 2, 3 };
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}

		System.out.println(map);
	}

}
