package dsa.stacksAndQueue;

import java.util.Stack;

public class PostflixEvaluationAndConversions {
    public static void main(String[] args) {
        String exp = "264*8/+3-";
        Stack<Integer> values = new Stack<>();
        Stack<String> inflix = new Stack<>();
        Stack<String> prefix = new Stack<>();
        Stack<Character> operates = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                operates.push(ch);
            } else if ((ch >= '0' && ch <= '9') ||
                    (ch >= 'a' && ch <= 'z') ||
                    (ch >= 'A' && ch <= 'Z')) {
                values.push(ch - '0');
                inflix.push(ch + "");
                prefix.push(ch + "");
            }
            while (operates.size() > 0
                    && precedance(ch) <= precedance(operates.peek())) {
                process(values, inflix, prefix, operates);
            }
        }
        while (operates.size() > 0) {
            process(values, inflix, prefix, operates);
        }
        System.out.println(values.peek());
        System.out.println(inflix.peek());
        System.out.println(prefix.peek());
    }

    private static int precedance(char ch) {
        if (ch == '+' || ch == '-') {
            return 1;
        } else if (ch == '*' || ch == '/') {
            return 2;
        } else {
            return 0;
        }
    }

    private static String bracketsAround(String inf1, String inf2, char ops) {
        return "(" + inf1 + ops + inf2 + ")";
    }

    private static int calculate(int v1, int v2, char ops) {
        if (ops == '+') {
            return v1 + v2;
        } else if (ops == '-') {
            return v1 - v2;
        } else if (ops == '*') {
            return v1 * v2;
        } else {
            return v1 / v2;
        }
    }

    public static void process(Stack<Integer> values,
                               Stack<String> inflix, Stack<String> prefix,
                               Stack<Character> operates) {
        char ops = operates.pop();

        int v2 = values.pop();
        int v1 = values.pop();
        int cal = calculate(v1, v2, ops);
        values.push(cal);

        String prev2 = prefix.pop();
        String prev1 = prefix.pop();
        String pres = ops + prev1 + prev2;
        prefix.push(pres);

        String inf2 = inflix.pop();
        String inf1 = inflix.pop();
        String inflis = bracketsAround(inf1, inf2, ops);
        inflix.push(inflis);
    }
}
