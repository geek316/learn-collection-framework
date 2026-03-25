package net.startegicfarming.problems.listinterface.stack;

// For each element, find the next greater element to its right

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    static void main() {

        int[] arr = {4,5,2,10,0,8,12};
        int[] res = nextGreater(arr);
        System.out.println(Arrays.toString(res));

    }

    static int[] nextGreater(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];

        Stack<Integer> stack = new Stack<>();

        for (int i = n-1; i >=0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            result[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(arr[i]);
        }
        return result;
    }
}
