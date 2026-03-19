package net.startegicfarming.learnlistinterface;

import java.util.Stack;

public class LearningStack {
    static void main() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("Original Stack : " + stack);
        stack.pop();
        System.out.println("After pop : " + stack);
        System.out.println("Peek : " + stack.peek());
        System.out.println(stack.isEmpty());

        System.out.println("position of 3 from start of stack : " + stack.search(3));
        System.out.println(stack);
    }
}
