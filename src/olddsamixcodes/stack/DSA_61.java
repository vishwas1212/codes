package olddsamixcodes.stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * @author Vishwas Infix Conversions
 *
 */
public class DSA_61 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String exp = br.readLine();

		// Create 3 stack. postfix, prefix and operators
		Stack<String> postFix = new Stack<>();
		Stack<String> preFix = new Stack<>();
		Stack<Character> ops = new Stack<>();

		for (int i = 0; i < exp.length(); i++) {
			char ch = exp.charAt(i);

			if (ch == '(') {
				ops.push(ch);
			} else if (ch >= '0' && ch <= '9' || ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {

				postFix.push(ch + "");
				preFix.push(ch + "");

			} else if (ch == ')') {
				while (ops.peek() != '(') {

					/*
					 * char op = ops.pop();
					 * 
					 * String postv2 = postFix.pop(); String postv1 = postFix.pop(); String posv =
					 * postv1 + postv2 + op; postFix.push(posv);// push the procession into post
					 * stack
					 * 
					 * String prev2 = preFix.pop(); String prev1 = preFix.pop(); String prev = op +
					 * prev1 + prev2; preFix.push(prev);// push the procession into pre stack
					 */

					procession(postFix, preFix, ops);
				}
				ops.pop();

			}

			else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {

				while (ops.size() > 0 && ops.peek() != '(' && precedence(ch) <= precedence(ops.peek())) {

					/*
					 * char op = ops.pop();
					 * 
					 * String postv2 = postFix.pop(); String postv1 = postFix.pop(); String postv =
					 * postv1 + postv2 + op; postFix.push(postv);// push the procession into post
					 * stack
					 * 
					 * String prev2 = preFix.pop(); String prev1 = preFix.pop(); String prev = op +
					 * prev1 + prev2; preFix.push(prev);// push the procession into pre stack
					 */

					procession(postFix, preFix, ops);
				}
				ops.push(ch);

			}
		}

		while (ops.size() > 0) {
			/*
			 * char op = ops.pop();
			 * 
			 * String postv2 = postFix.pop(); String postv1 = postFix.pop(); String postv =
			 * postv1 + postv2 + op; postFix.push(postv);// push the procession into post
			 * stack
			 * 
			 * String prev2 = preFix.pop(); String prev1 = preFix.pop(); String prev = op +
			 * prev1 + prev2; preFix.push(prev);// push the procession into pre stack
			 */
			procession(postFix, preFix, ops);
		}
		System.out.println("Postfix " + postFix.peek());
		System.out.println("Prefix " + preFix.peek());

	}

	private static void procession(Stack<String> postfix, Stack<String> prefix, Stack<Character> ops) {
		char op = ops.pop();
		String posv2 = postfix.pop();
		String posv1 = postfix.pop();
		String posv = posv1 + posv2 + op;
		postfix.push(posv);// push the procession into post stack

		String prev2 = prefix.pop();
		String prev1 = prefix.pop();
		String prev = op + prev1 + prev2;
		prefix.push(prev);// push the procession into pre stack
	}

	private static int precedence(char ch) {
		if (ch == '+' || ch == '-') {
			return 1;
		} else if (ch == '*' || ch == '/') {
			return 2;
		} else
			return 0;
	}

}
