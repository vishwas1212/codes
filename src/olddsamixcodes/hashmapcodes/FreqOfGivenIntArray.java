package olddsamixcodes.hashmapcodes;

import java.util.HashMap;
import java.util.Map.Entry;

public class FreqOfGivenIntArray {

	public static void main(String[] args) {
		int[] arr = { 11, 22, 33, 44, 11, 22, 33, 44, 1, 2, 3, 4, 1, 2 };

		HashMap<Integer, Integer> hashMap = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			/*
			 * if (hashMap.containsKey(arr[i])) { hashMap.put(arr[i], hashMap.get(arr[i]) +
			 * 1); } else { hashMap.put(arr[i], 1); }
			 */
			hashMap.put(arr[i], hashMap.getOrDefault(arr[i],0)+1);
		}

		for (Entry entry : hashMap.entrySet()) {
			Integer count = (Integer) entry.getValue();
			if(count>1)
			{
				System.out.println(entry);
			}else{
				System.out.println(entry+" -> -1");
			}
		}

	}

}
