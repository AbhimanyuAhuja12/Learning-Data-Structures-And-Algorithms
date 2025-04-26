package Stacks;

public class TwoStackInAnArray {
    int[] arr;
    int ptr1; // pointer for Stack 1
    int ptr2; // pointer for Stack 2

    public TwoStackInAnArray(int cap) {
        arr = new int[cap];
        ptr1 = -1;           // Stack1 starts from -1 (left to right)
        ptr2 = arr.length;   // Stack2 starts from arr.length (right to left)
    }

    // Function to push an integer into stack1
    void push1(int x) {
        if (ptr1 + 1 == ptr2) {
            System.out.println("Stack Overflow on push1");
            return;
        }
        arr[++ptr1] = x;
    }

    // Function to push an integer into stack2
    void push2(int x) {
        if (ptr1 + 1 == ptr2) {
            System.out.println("Stack Overflow on push2");
            return;
        }
        arr[--ptr2] = x;
    }

    // Function to remove an element from top of stack1
    int pop1() {
        if (ptr1 == -1) {
            System.out.println("Stack Underflow on pop1");
            return -1;
        }
        return arr[ptr1--];
    }

    // Function to remove an element from top of stack2
    int pop2() {
        if (ptr2 == arr.length) {
            System.out.println("Stack Underflow on pop2");
            return -1;
        }
        return arr[ptr2++];
    }

    // Return the size of stack1
    int size1() {
        return ptr1 + 1;
    }

    // Return the size of stack2
    int size2() {
        return arr.length - ptr2;
    }

    int top1() {
        if (size1() == 0) return -1;
        else return arr[ptr1];
    }

    int top2() {
        if (size2() == 0) return -1;
        else return arr[ptr2];
    }
}