package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class InfixEvaluation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String expression = input.next();

        System.out.println(EvaluateInfixExpression(expression));

    }

    private static int EvaluateInfixExpression(String expression) {
        Stack<Character> operator = new Stack<>();
        Stack<Integer> operand = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (ch == '(') {
                operator.push(ch);
            } else if (ch == ')') {
                while (operator.peek() != '(') {
                    char op = operator.pop();
                    int n2 = operand.pop();
                    int n1 = operand.pop();
                    int curr = Calculate(n1, n2, op);
                    operand.push(curr);
                }
                operator.pop(); // pop the '('
            } else if (ch == '*' || ch == '/' || ch == '+' || ch == '-') {
                  while(!operator.isEmpty() && operator.peek()!='(' && hasHighPriority(operator.peek(),ch)){
                      char op = operator.pop();
                      int n2 = operand.pop();
                      int n1 = operand.pop();
                      int curr = Calculate(n1, n2, op);
                      operand.push(curr);
                  }
                operator.push(ch);
            } else {
                operand.push(ch-'0');
            }
        }

        while (!operator.isEmpty()) {
            char op = operator.pop();
            int n2 = operand.pop();
            int n1 = operand.pop();
            int curr = Calculate(n1, n2, op);
            operand.push(curr);
        }

        return operand.pop();

    }

    private static boolean hasHighPriority(Character peek, char ch) {
        if ((peek == '+' || peek == '-') && (ch == '*' || ch == '/')) {
            return false; // current has higher precedence → don't pop
        }
        return true; // top has higher or equal precedence → pop
    }


    private static int Calculate(int n1, int n2, char op) {
        if (op == '+') {
            return n1 + n2;
        } else if (op == '-') {
            return n1 - n2;
        } else if (op == '/') {
            return n1 / n2;
        } else {
            return n1 * n2;
        }
    }
}
