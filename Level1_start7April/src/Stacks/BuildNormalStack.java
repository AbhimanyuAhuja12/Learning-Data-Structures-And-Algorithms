package Stacks;

public class BuildNormalStack {
    static class CustomStack {
        private int top = -1;
        private final int[] arr = new int[20];

        public void push(int value) {
            if (top == arr.length - 1) {
                System.out.println("Stack Overflow");
                return;
            }
            top++;
            arr[top] = value;
        }

        public int pop() {
            if (top == -1) {
                System.out.println("Stack is empty");
                return -1;
            }
            return arr[top--];
        }

        public int peek() {
            if (top == -1) {
                System.out.println("Stack is empty");
                return -1;
            }
            return arr[top];
        }

        public int size() {
            return top + 1;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder("Stack (top to bottom):\n");
            for (int i = top; i >= 0; i--) {
                sb.append(arr[i]).append("\n");
            }
            return sb.toString();
        }

    }

    public static void main(String[] args) {
        //BuildNormalStack outer = new BuildNormalStack(); // for accessing inner class
        CustomStack stack = new CustomStack();

        stack.push(10);
        stack.push(20);
        System.out.println("Top: " + stack.peek()); // 20
        System.out.println("Size: " + stack.size()); // 2
        System.out.println("Popped: " + stack.pop()); // 20
        System.out.println("Top after pop: " + stack.peek());
        System.out.println(stack);
    }
}
