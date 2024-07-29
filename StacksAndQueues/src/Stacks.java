import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Stack<Integer>stack = new Stack<>();

        System.out.println(stack);

        stack.push(34);
        stack.push(58);
        stack.push(45);
        stack.push(31);
        stack.push(7);
        System.out.println(stack.capacity());// initial capacity is 10
        System.out.println(stack.search(58));
        System.out.println(stack.elementAt(3));
        Stack<Integer>copy = (Stack<Integer>) stack.clone();
        System.out.println(copy);

        Stack<String> curr = new Stack<>();
        curr.push("abhi");


        System.out.println(stack.pop());
    }
}
