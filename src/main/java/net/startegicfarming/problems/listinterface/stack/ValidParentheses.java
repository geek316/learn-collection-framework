package net.startegicfarming.problems.listinterface.stack;

import java.util.Stack;

public class ValidParentheses {
    static void main() {

        System.out.println("Checking for valid parentheses.");
        String parenth1 = "({[]}){()}";
        String parenth2 = "{([)}]";

        System.out.println("Parentheses : " + parenth1 + " is valid ? - " + isValid(parenth1));
        System.out.println("Parentheses : " + parenth2 + " is valid ? - " + isValid(parenth2));

    }

    static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()) {

            if( ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();

                if((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

}
