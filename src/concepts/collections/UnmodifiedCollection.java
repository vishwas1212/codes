package concepts.collections;

import java.util.*;
import java.util.Collections;
import java.util.List;


public class UnmodifiedCollection {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add("Ram");
        list.add(1);
        list.add("Shyam");
        System.out.println(list);
        list.add(1.2);
        System.out.println("Before Making list Unmodifiable: " + list);
        list = Collections.unmodifiableList(list);
        System.out.println( list.get(0));
        list.add(1);
        list.set(0, "Sita");
        list.remove(3);
        System.out.println(list);

        Set set = new HashSet();
        set.add("Ram");
        set.add(1);
        set.add("Shyam");
        System.out.println(set);
        set.add(1.2);
        System.out.println("Before Making set Unmodifiable: " + set);

        Map map = new HashMap();
        map.put("Ram", 1);
        map.put(1, 2);
        map.put("Shyam", 3);
        System.out.println(map);
        map.put(1.2, 4);
        System.out.println("Before Making map Unmodifiable: " + map);
    }
}
