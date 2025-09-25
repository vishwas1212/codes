package olddsamixcodes.demo;

import java.util.ArrayList;
import java.util.List;

public class MainMethodOverloading {

	public static void main(String[] args) {
		Object ob = new Object();
		something(ob);
		something(null);
		something("Abc");

		String s1 = "HELLO";
		String s2 = "HELLO";
		String s3 = new String("HELLO");
		
		int[] array = {6,9,8};
		List<Integer> list = new ArrayList<>();
		list.add(array[0]);
		System.out.println(list);
		list.add(array[2]);
		System.out.println(list);
		list.set(1, array[1]);
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
	}

	public static void something(Object obj) {
		System.out.println("Object");
	}

	public static void something(String args) {
		System.out.println("String");
	}

	}


