package net.startegicfarming.problems.listinterface.stack;

// Postfix notation (also called Reverse Polish Notation, RPN) is a way of writing arithmetic expressions where the operator comes after the operands,
// instead of between them (like in infix notation).

import java.util.Stack;

public class EvaluatePostfixExpression {
    static void main() {

        String exp = "23*54*+9-";
        System.out.println("Result for : " +exp+ " is : "+ evaluate(exp));
    }

    static int evaluate(String exp) {
        Stack<Integer> stack = new Stack<>();

        for (char ch : exp.toCharArray()) {

            if(Character.isDigit(ch)) {
                stack.push(ch - '0');
            } else {
                int b = stack.pop();
                int a = stack.pop();

                switch (ch) {
                    case '+': stack.push(a+b); break;
                    case '-': stack.push(a-b); break;
                    case '*': stack.push(a*b); break;
                    case '/': stack.push(a/b); break;
                }
            }
        }
        return stack.pop();
    }
}
