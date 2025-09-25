package dsa.stacksAndQueue;

import java.util.Stack;

public class PrefixEvaluationAndConversions {
    public static void main(String[] args) {
        String exp = "-+2/*6483";
        Stack<Integer> values = new Stack<>();
        Stack<String> inflix = new Stack<>();
        Stack<String> postfix = new Stack<>();

        for (int i = exp.length()-1; i >= 0; i--) {
            char ch = exp.charAt(i);

            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                int v1 = values.pop();
                int v2 = values.pop();
                int cal = calculate(v1, ch, v2);
                values.push(cal);

                String inf1 = inflix.pop();
                String inf2 = inflix.pop();
                String inflxes = "(" + inf1 + ch + inf2 + ")";
                inflix.push(inflxes);

                String pf1 = postfix.pop();
                String pf2 = postfix.pop();
                String postflixes = pf1 + pf2 + ch;
                postfix.push(postflixes);
            } else {
                values.push(ch - '0');
                inflix.push(ch + "");
                postfix.push(ch + "");
            }
        }

        System.out.println(values.peek());
        System.out.println(inflix.peek());
        System.out.println(postfix.peek());
    }

    private static int calculate(int v1, char ch, int v2) {
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
