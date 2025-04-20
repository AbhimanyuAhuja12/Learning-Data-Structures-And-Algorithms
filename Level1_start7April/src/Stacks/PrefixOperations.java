package Stacks;

import java.util.Stack;
import java.util.Scanner;

public class PrefixOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String expression = input.nextLine();

        String ans = convertToInfixAndPostfix(expression);
        int value = EvaluatePrefix(expression);
        System.out.println(ans);
        System.out.println(value);
    }

    private static int EvaluatePrefix(String expression) {
        Stack<Integer> stack = new Stack<>();

        for (int i = expression.length() - 1; i >= 0; i--) {
            char ch = expression.charAt(i);

            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                int operand1 = stack.pop();
                int operand2 = stack.pop();
                int curr = Calculate(operand1, operand2, ch);
                stack.push(curr);

            } else {
                stack.push(ch - '0');
            }
        }

        return stack.pop();
    }

    public static String convertToInfixAndPostfix(String expression) {
        Stack<String> infixStack = new Stack<>();
        Stack<String> postfixStack = new Stack<>();

        for (int i = expression.length() - 1; i >= 0; i--) {
            char ch = expression.charAt(i);

            if (isOperator(ch)) {
                // Pop two operands from the infix stack
                String infixOp1 = infixStack.pop();
                String infixOp2 = infixStack.pop();
                String infixExpr = buildInfix(infixOp1, infixOp2, ch);
                infixStack.push(infixExpr);

                // Pop two operands from the postfix stack
                String postfixOp1 = postfixStack.pop();
                String postfixOp2 = postfixStack.pop();
                String postfixExpr = buildPostfix(postfixOp1, postfixOp2, ch);
                postfixStack.push(postfixExpr);

            } else if (Character.isLetterOrDigit(ch)) {
                // Operand: push to both stacks
                infixStack.push(String.valueOf(ch));
                postfixStack.push(String.valueOf(ch));
            }
        }

        // Assuming the expression is valid, both stacks should contain one result each
        String infixResult = infixStack.pop();
        String postfixResult = postfixStack.pop();

        return "Infix: " + infixResult + "\nPostfix: " + postfixResult;
    }

    private static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }

    private static String buildInfix(String operand1, String operand2, char operator) {
        return "(" + operand1 + " " + operator + " " + operand2 + ")";
    }

    private static String buildPostfix(String operand1, String operand2, char operator) {
        return operand1 + " " + operand2 + " " + operator;
    }


    private static int Calculate(int operand1, int operandp2, char ch) {
        if (ch == '+') return operand1 + operandp2;
        else if (ch == '-') return operand1 - operandp2;
        else if (ch == '*') return operand1 * operandp2;
        return operand1 / operandp2;
    }
}
