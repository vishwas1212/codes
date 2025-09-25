package concepts.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapPrintWays {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Cherry", 30);

        System.out.println(map);
        System.out.println("----------");

        map.forEach((key, value) -> System.out.println(key + " " + value));
        System.out.println("----------");

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println("----------");

        for (String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
        System.out.println("----------");

        for (Integer value : map.values()) {
            System.out.println(value);
        }

        System.out.println("----------");

        map.entrySet().stream()
                .forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));

        System.out.println("----------");

        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println("----------");

    }
}
