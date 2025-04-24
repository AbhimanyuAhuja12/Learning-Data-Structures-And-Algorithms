package Stacks;

import java.util.Stack;

public class MinimumStack2 {

    Stack<Long> stack;
    long min;

    public MinimumStack2() {
        stack = new Stack<>();
    }

    public void push(int val) {
        if (stack.isEmpty()) {
            stack.push(0L); // diff = val - min = 0
            min = val;
        } else {
            stack.push((long) val - min);
            if (val < min) {
                min = val;
            }
        }
    }

    public void pop() {
        if (stack.isEmpty()) return;

        long diff = stack.pop();
        if (diff < 0) {
            min = min - diff; // undo the change
        }
    }

    public int top() {
        if (stack.isEmpty()) return -1;

        long diff = stack.peek();
        if (diff >= 0) {
            return (int) (min + diff);
        } else {
            return (int) min;
        }
    }

    public int getMin() {
        if (stack.isEmpty()) return -1;
        return (int) min;
    }
}

