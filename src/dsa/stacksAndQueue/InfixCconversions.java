package dsa.stacksAndQueue;

import java.util.Stack;

public class InfixCconversions {
    public static void main(String[] args) {
        String exp = "a*(b-c)/d+e";
        Stack<String> prefix = new Stack<>();
        Stack<String> postfix = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (ch == '(') {
                operators.push(ch);
            } else if ((ch >= '0' && ch <= '9') ||
                    (ch >= 'a' && ch <= 'z') ||
                    (ch >= 'A' && ch <= 'Z')) {
                prefix.push(ch + "");
                postfix.push(ch + "");
            } else if (ch == ')') {
                while (operators.peek() != '(') {
                    process(operators, prefix, postfix);
                }
                operators.pop();
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (operators.size() > 0 && operators.peek() != '('
                        && precedance(ch) <= precedance(operators.peek())) {
                    process(operators, prefix, postfix);
                }
                operators.push(ch);
            }
        }
        while (operators.size() > 0) {
            process(operators, prefix, postfix);
        }
        System.out.println(prefix.peek() + " and size: " + prefix.size());
        System.out.println(postfix.peek() + " and size: " + postfix.size());
    }

    private static int precedance(char ch) {
        if (ch == '+') {
            return 1;
        } else if (ch == '-') {
            return 1;
        } else if (ch == '*') {
            return 2;
        } else {
            return 2;
        }
    }

    public static void process(Stack<Character> operators, Stack<String> prefix, Stack<String> postfix) {
        char optors = operators.pop();

        String v2 = prefix.pop();
        String v1 = prefix.pop();
        String preOps = optors + v1 + v2;
        prefix.push(preOps);

        String v12 = postfix.pop();
        String v11 = postfix.pop();
        String postOps = v11 + v12 + optors;
        postfix.push(postOps);
    }
}
