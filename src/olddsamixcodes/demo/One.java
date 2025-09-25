package olddsamixcodes.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class One {

	public static void main(String[] args) {

		test(null);
		int i = 1 + +1 - -2 + +1 - -1 + +1;
		System.out.println(i);

		if (3 * 0.1 == 0.3)
			System.out.println("if" + 3 * 0.1);
		else
			System.out.println("else " + 3 * 0.1);
		
		
		String str = "she sells sea shells";
		String rex = "SsS";
		String replace = "X";
		Pattern p = Pattern.compile(rex);
		Matcher m = p.matcher(str);
		String val = m.replaceAll(replace);
		System.out.println(val);
	}

	public static void test(Object o) {
		System.out.println("Object argument");
	}

	public static void test(String s) {
		System.out.println("String argument");
	}

}
