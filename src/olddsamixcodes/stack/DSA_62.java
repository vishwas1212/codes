package olddsamixcodes.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * @author Vishwas Postfix Conversions and Evaluation
 *
 */
public class DSA_62 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String exp = br.readLine();

		// 3 dsa.stacks for value infix and perfix
		Stack<Integer> vs = new Stack<>();
		Stack<String> is = new Stack<>();
		Stack<String> ps = new Stack<>();

		for (int i = 0; i < exp.length(); i++) {
			char ch = exp.charAt(i);

			if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {

				int v2 = vs.pop();
				int v1 = vs.pop();
				int vsval = operation(v1, v2, ch);
				vs.push(vsval);

				String ival2 = is.pop();
				String ival1 = is.pop();
				String ival = "(" + ival1 + ch + ival2 + ")";
				is.push(ival);

				String psval2 = ps.pop();
				String psval1 = ps.pop();
				String pval = ch + psval1 + psval2;
				ps.push(pval);

			} else {
				vs.push(ch - '0');
				is.push(ch + "");
				ps.push(ch + "");
			}
		}
		System.out.println("Value Stack " + vs.pop());
		System.out.println("Infix Conversion " + is.pop());
		System.out.println("Prefix Conversion " + ps.pop());

	}

	private static int operation(int v1, int v2, char ch) {
		if (ch == '+') {
			return v1 + v2;
		} else if (ch == '-') {
			return v1 - v2;
		} else if (ch == '*') {
			return v1 * v2;
		} else {
			return v1 / v2;
		}

	}

}
