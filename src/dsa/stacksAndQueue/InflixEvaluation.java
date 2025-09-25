package dsa.stacksAndQueue;

import java.util.Stack;

public class InflixEvaluation {
    public static void main(String[] args) {
        String exp = "2+(5-9*6/3)";
        Stack<Integer> oprnds = new Stack<>();
        Stack<Character> optors = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (ch == '(') {
                optors.push(ch);
            } else if (Character.isDigit(ch)) {
                oprnds.push(ch - '0');
            } else if (ch == ')') {
                while (optors.peek() != '(') {
                    char optor = optors.pop();
                    int v2 = oprnds.pop();
                    int v1 = oprnds.pop();

                    int opv = operations(v1, v2, optor);
                    oprnds.push(opv);
                }
                optors.pop();
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (optors.size() > 0 && optors.peek() != '(' &&
                        precedance(ch) <= precedance(optors.peek())) {
                    char optor = optors.pop();
                    int v2 = oprnds.pop();
                    int v1 = oprnds.pop();
                    int opv = operations(v1, v2, optor);
                    oprnds.push(opv);
                }
                optors.push(ch);
            }
        }

        while (optors.size() != 0) {
            char optor = optors.pop();
            int v2 = oprnds.pop();
            int v1 = oprnds.pop();
            int opv = operations(v1, v2, optor);
            oprnds.push(opv);
        }
        System.out.println(oprnds.peek());
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

    private static int operations(int v1, int v2, char optor) {
        if (optor == '+') {
            return v1 + v2;
        } else if (optor == '-') {
            return v1 - v2;
        } else if (optor == '*') {
            return v1 * v2;
        } else {
            return v1 / v2;
        }
    }
}
