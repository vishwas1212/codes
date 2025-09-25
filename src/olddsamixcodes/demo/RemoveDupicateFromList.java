package olddsamixcodes.demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDupicateFromList {

	public static void main(String[] args) {
		List list = new ArrayList<>();
		list.add("Ram");
		list.add("Shyam");
		list.add("Mohan");
		list.add("Sohan");
		list.add("Ram");
		list.add("Shyam");
		list.add("Mohan");
		list.add("Sohan");
		list.add("Ram");
		list.add("Shyam");
		list.add("Mohan");
		list.add("Sohan");
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println(list);
		
		Set hs=new HashSet<>(list);
		
		System.out.println(hs);
		
		Set hs1=new HashSet<>();
		hs1.addAll(list);
		System.out.println(hs1);
		
		hs.addAll(list);
		
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i) == list.get(j)) {
					list.remove(j);
					j--;
				}
			}
		}
		System.out.println(list);

	}

}
