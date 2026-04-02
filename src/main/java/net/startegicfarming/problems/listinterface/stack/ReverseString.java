package net.startegicfarming.problems.listinterface.stack;

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {

        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        String hello = "HELLO";
        System.out.println("String : " + hello);

        for (char ch : hello.toCharArray()) {
            stack.push(ch);
        }

        System.out.print("Reversed String : ");
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        System.out.println(result);
    }
}
