package olddsamixcodes.hashmapcodes;

import java.util.HashMap;
import java.util.Map;

public class PubliciesSapientFrequency {

	public static void main(String[] args) {
		String logs[] = { 
				"10.0.0.22 log line 1", 
				"10.0.0.22 log line 2", 
				"10.0.0.20 log line 3",
				"10.0.0.20 log line 4", 
				"10.0.0.21 log line 5" 
				};

		HashMap<String, Integer> map = new HashMap<>();

		for (int i = 0; i < logs.length; i++) {
			String str = logs[i].split(" ")[0];
//			System.out.println(str);
			map.put(str, map.getOrDefault(str, 0) + 1);
		}

		for (Map.Entry entry : map.entrySet()) {
			Integer count = (Integer) entry.getValue();
			if(count>1)
			{
				System.out.println(entry);
			}
		}

	}

}
