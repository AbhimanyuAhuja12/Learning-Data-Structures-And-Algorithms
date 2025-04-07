package Stacks;

import java.util.Scanner;
import java.util.Stack;

// assumption is that expression is balanced  i.e opening and closing brackets match with each other
public class DuplicateBrackets {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the expression with balanced brackets");
        String expression = input.next();

        System.out.println(containsDuplicateBrackets(expression));
    }

    public static boolean containsDuplicateBrackets(String expression) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (ch != ')') {
                stack.push(ch);
            }
            if (ch == ')') {
                int count = 0;
                while (stack.peek() != '(') {
                    stack.pop();
                    count++;
                }
                if (count == 0) return true;
                stack.pop();
            }
        }
        return false;
    }

    /*
    for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (ch == ')') {
               if(stack.peek()=='('){
                   return true;
               }else{
               while(stack.peek()!='('){
                   stack.pop();
                }
                stack.pop();
            }
            else{
              stack.push(ch);
            }
        }
     */
}
