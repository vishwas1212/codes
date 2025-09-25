package olddsamixcodes.stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringCounting {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("Apple");
		list.add("Apple");
		list.add("Apple");
		list.add("Mango");

		System.out.println(list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));
		System.out.println(list.stream().collect(Collectors.groupingBy(l->l,Collectors.counting())));
		
		String[] name= {"Vishwas Vimal"};
		List<String> names=Arrays.asList(name);
		
		System.out.println(names.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));

	}

}
