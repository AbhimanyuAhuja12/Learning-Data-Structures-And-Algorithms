package Stacks;

import java.util.Stack;

public class MinimumStack1 {

    public static class MinStack {
        Stack<Integer> mainStack = new Stack<>();
        Stack<Integer> minStack = new Stack<>();

        public void push(int value) {
            mainStack.push(value);

            if (minStack.isEmpty() || minStack.peek() >= value) {
                minStack.push(value);
            }
        }

        public int pop() {
            if (mainStack.isEmpty()) {
                throw new RuntimeException("Stack is empty");
            }
            int value = mainStack.pop();

            if (value == minStack.peek()) {
                minStack.pop();
            }

            return value;
        }

        public int peek() {
            if (mainStack.isEmpty()) {
                throw new RuntimeException("Stack is empty");
            }
            return mainStack.peek();
        }

        public int min(){
            if (mainStack.isEmpty()) {
                throw new RuntimeException("Stack is empty");
            }
            return minStack.peek();
        }

        public int size() {
            return mainStack.size();
        }


    }

    public static void main(String[] args) {
        MinStack stack = new MinStack();
        stack.push(34);
        stack.push(4);
        stack.push(344);
        System.out.println(stack.min());
        System.out.println(stack.pop());
    }


}
