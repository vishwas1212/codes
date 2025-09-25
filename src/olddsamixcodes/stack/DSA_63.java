package olddsamixcodes.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * @author Vishwas Prefix Conversions and Evaluations
 *
 */
public class DSA_63 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String exp = br.readLine();

		Stack<Integer> vs = new Stack<>();
		Stack<String> is = new Stack<>();
		Stack<String> ps = new Stack<>();

		for (int i = exp.length() - 1; i >= 0; i--) {
			char ch = exp.charAt(i);

			if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {

				int v1 = vs.pop();
				int v2 = vs.pop();
				int val = operation(v1, v2, ch);
				vs.push(val);
				System.out.println("v1 " + v1 + "  " + "v2 " + v2 + " Operator " + ch + " so " + " val " + val);

				String is1 = is.pop();
				String is2 = is.pop();
				String ival = "(" + is1 + ch + is2 + ")";
				is.push(ival);

				String pv1 = ps.pop();
				String pv2 = ps.pop();
				String pval = pv1 + pv2 + ch;
				ps.push(pval);

			} else {
				vs.push(ch - '0');
				is.push(ch + "");
				ps.push(ch + "");
			}
		}

		System.out.println("Value Stack " + vs.pop());
		System.out.println("Infix Conversion " + is.pop());
		System.out.println("PostFix Conversion " + ps.pop());

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
