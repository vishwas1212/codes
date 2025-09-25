package olddsamixcodes.hashmapcodes;

import java.util.HashMap;

public class StringFreq {

	public static void main(String[] args) {
		String str = "Vvvvvvishwas Vimal";
		String str1 = str.replaceAll("\\s", "");
		char[] ch = str1.toCharArray();

		HashMap<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < str1.length(); i++) {
			map.put(ch[i], map.getOrDefault(ch[i], 0) + 1);
		}

		

		Character key = map.entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1)
				.get().getKey();

		System.out.println(key);

	}

}
