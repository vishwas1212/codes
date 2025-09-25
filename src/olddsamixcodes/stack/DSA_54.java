package olddsamixcodes.stack;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author Vishwas Balanced Brackets
 *
 */
public class DSA_54 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();

		Stack<Character> st = new Stack<>();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch == '(' || ch == '{' || ch == '[') {
				st.push(ch);
			} else if (ch == ')') {
				boolean val = handleClosing(st, '(');
				if (val == false) {
					System.out.println(val);
					return;
				}

			} else if (ch == '}') {
				boolean val = handleClosing(st, '{');
				if (val == false) {
					System.out.println(val);
					return;
				}
			} else if (ch == ']') {
				boolean val = handleClosing(st, '[');
				if (val == false) {
					System.out.println(val);
					return;
				}
			} else {

			}
		}
		if (st.size() == 0) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

	}

	private static boolean handleClosing(Stack<Character> st, char corresoch) {
		if (st.size() == 0) {
			return false;
		} else if (st.peek() != corresoch) {
			return false;
		} else {
			st.pop();
			return true;
		}
	}

}
