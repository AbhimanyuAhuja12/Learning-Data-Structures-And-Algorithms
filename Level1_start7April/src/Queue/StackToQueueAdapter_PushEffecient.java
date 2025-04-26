package Queue;

import java.util.Stack;

public class StackToQueueAdapter_PushEffecient {
    Stack<Integer> MainStack;
    Stack<Integer> HelperStack;

    public StackToQueueAdapter_PushEffecient() {
        MainStack = new Stack<>();
        HelperStack = new Stack<>();
    }

    public void push(int x) {
        MainStack.push(x);
    }

    public int pop() {
        while (!MainStack.isEmpty()) {
            HelperStack.push(MainStack.pop());
        }
        int val = HelperStack.pop();
        while (!HelperStack.isEmpty()) {
            MainStack.push(HelperStack.pop());
        }
        return val;
    }

    public int peek() {
        while (!MainStack.isEmpty()) {
            HelperStack.push(MainStack.pop());
        }
        int val = HelperStack.peek();
        while (!HelperStack.isEmpty()) {
            MainStack.push(HelperStack.pop());
        }
        return val;
    }

    public boolean empty() {
        return MainStack.isEmpty();
    }
}


