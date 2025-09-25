package olddsamixcodes.demo;

import java.util.HashMap;

public class FindTheIndexHavingSumTarget {

	public static void main(String[] args) {

		int[] arr = { 2, 7, 11, 15, 3, 3, 3 };
		int target = 6;

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			int cal = target - arr[i];
			if (map.containsKey(cal)) {
				System.out.println(map.get(cal) + " " + i);
			}
			map.put(arr[i], i);
		}
	}

}
