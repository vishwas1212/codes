package olddsamixcodes.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * @author Vishwas Minimum Stack
 *
 */
public class DSA_70 {

	public static class MinStack {
		Stack<Integer> data;
		int min;

		public MinStack() {
			data = new Stack<>();
		}

		public int size() {
			return data.size();
		}

		public void push(int val) {

			if (size() == 0) {

				data.push(val);
				min = val;
			}

			else if (val < min) {
				data.push(val + val - min);
				min = val;
			} else {
				data.push(val);
			}

		}

		public int pop() {
			if (size() == 0) {
				System.out.println("Stack Underflow!");
				return -1;
			} else {
				if (data.peek() < min) {
					int oval = min;
					min = 2 * min - data.pop();
					return oval;
				} else {
					return data.pop();
				}
			}
		}

		public int top() {

			if (size() == 0) {
				System.out.println("Stack Undeflow!");
				return -1;
			} else {
				if (data.peek() >= min) {
					return data.peek();
				} else {
					return min();
				}
			}
		}

		public int min() {

			if (size() == 0) {
				System.out.println("Stack Undeflow!");
				return -1;
			} else {
				return min;
			}
		}

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		MinStack st = new MinStack();

		String str = br.readLine();
		while (str.equals("quit") == false) {
			if (str.startsWith("push")) {
				int val = Integer.parseInt(str.split(" ")[1]);
				st.push(val);
			} else if (str.startsWith("pop")) {
				int val = st.pop();
				if (val != -1) {
					System.out.println(val);
				}
			} else if (str.startsWith("top")) {
				int val = st.top();
				if (val != -1) {
					System.out.println(val);
				}
			} else if (str.startsWith("size")) {
				System.out.println(st.size());
			} else if (str.startsWith("min")) {
				int val = st.min();
				if (val != -1) {
					System.out.println(val);
				}
			}
			str = br.readLine();
		}

	}

}
