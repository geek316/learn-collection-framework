package net.startegicfarming.problems.listinterface.stack;

import java.util.Stack;

public class MinStack {

    public static void main(String[] args) {

        MinSingleStack ms = new MinSingleStack();

        ms.push(5);
        ms.push(3);
        ms.push(7);
        ms.push(2);

        System.out.println("Finding minimum value in the stack with single stack method.");
        System.out.println("Min : " + ms.getMin());
        ms.pop();
        System.out.println("Min after pop : " + ms.getMin());
        System.out.println("Top : " + ms.top());
        System.out.println();
        System.out.println();


        MinTwoStack mds = new MinTwoStack();

        mds.push(5);
        mds.push(3);
        mds.push(7);
        mds.push(2);

        System.out.println("Two Stack Method");
        System.out.println("Min : " + mds.getMin());
        mds.pop();
        System.out.println("Min after pop : " + mds.getMin());
        System.out.println("Top : " + mds.top());


    }

}

class MinSingleStack {

    Stack<int[]> stack = new Stack<>();

    void push(int val) {
        if (stack.isEmpty()) {
            stack.push(new int[]{val, val});
        } else {
            int min = Math.min(val, stack.peek()[1]);
            stack.push(new int[]{val, min});
        }
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek()[0];
    }

    public int getMin() {
        return stack.peek()[1];
    }
}

class MinTwoStack {

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public void push(int val) {
        stack.push(val);
        if(minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    public void pop(){
        int removed = stack.pop();
        if (removed == minStack.peek()) {
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
