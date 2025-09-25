package olddsamixcodes.hashmapcodes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupOfAnagrams {

	public static void main(String[] args) {
		String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat", "tab" };
		List<List<String>> result = groupOfAnagrams(strs);
		System.out.println(result.toString());

	}

	private static List<List<String>> groupOfAnagrams(String[] strs) {

		List<List<String>> result = new ArrayList<>();
		HashMap<String, List<String>> map = new HashMap<>();

		for (String str : strs) {
			
			char[] ch = str.toCharArray();
			Arrays.sort(ch);
			String key = new String(ch);
			
			if (map.containsKey(key)) {
				map.get(key).add(str);
			}
			else
			{
				List<String> strList=new ArrayList<>();
				strList.add(str);
				map.put(key, strList);
			}
			
		}
		result.addAll(map.values());

		return result;
	}

}
