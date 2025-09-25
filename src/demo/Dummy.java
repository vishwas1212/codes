package demo;

import java.util.Stack;

public class Dummy {
    static void main() {
      //  String input = "[{()}]";
        String input = ")}]({[";

        Stack<Character> st = new Stack<>();
        boolean flag = true;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                if (st.isEmpty()) {
                    flag = false;
                    break;
                }
                Character top = st.pop();
                if (ch == ')' && top != '('
                        || ch == '}' && top != '{'
                        || ch == ']' && top != '[') {
                    flag = false;

                }
            }
        }
        if (!st.empty()) {
            flag = false;
        }
        System.out.println(flag);
    }
}
