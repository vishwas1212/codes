package olddsamixcodes.demo;

import java.util.Stack;

public class RemoveElementBeforeSpecialCharacter {

	public static void main(String[] args) {

		String str = "abcd###";
		Stack<Character> st = new Stack<>();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch != '#') {
				st.push(ch);
			} else {
				while (ch == '#')
					st.pop();
			}
		}

		System.out.println(st.size());

	}

}
