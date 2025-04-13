package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class InfixConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter infix expression: ");
        String InfixExpression = input.nextLine(); // supports full-line input with spaces or complex expressions

        String ans = ConvertToPrefixAndPostfix(InfixExpression);
        System.out.println(ans);
    }

    private static String ConvertToPrefixAndPostfix(String InfixExpression) {
        int n = InfixExpression.length();
        Stack<String> Prefix = new Stack<>();
        Stack<String> Postfix = new Stack<>();
        Stack<String> operator = new Stack<>();

        for (int i = 0; i < n; i++) {
            char ch = InfixExpression.charAt(i);

            if (ch == '(') {
                operator.push(String.valueOf(ch));
            } else if (ch == ')') {
                while (!operator.peek().equals("(")) {
                    String op = operator.pop();

                    // prefix
                    String n2 = Prefix.pop();
                    String n1 = Prefix.pop();
                    Prefix.push(CalculatePrefix(n1, n2, op));

                    // postfix
                    String n4 = Postfix.pop();
                    String n3 = Postfix.pop();
                    Postfix.push(CalculatePostfix(n3, n4, op));
                }
                operator.pop(); // remove '('
            } else if (isOperator(ch)) {
                while (!operator.isEmpty() && !operator.peek().equals("(")
                        && hasHighPriority(operator.peek(), String.valueOf(ch))) {

                    String op = operator.pop();

                    // prefix
                    String n2 = Prefix.pop();
                    String n1 = Prefix.pop();
                    Prefix.push(CalculatePrefix(n1, n2, op));

                    // postfix
                    String n4 = Postfix.pop();
                    String n3 = Postfix.pop();
                    Postfix.push(CalculatePostfix(n3, n4, op));
                }
                operator.push(String.valueOf(ch));
            } else if (ch != ' ') {
                // ignore spaces
                Prefix.push(String.valueOf(ch));
                Postfix.push(String.valueOf(ch));
            }
        }

        while (!operator.isEmpty()) {
            String op = operator.pop();

            // prefix
            String n2 = Prefix.pop();
            String n1 = Prefix.pop();
            Prefix.push(CalculatePrefix(n1, n2, op));

            // postfix
            String n4 = Postfix.pop();
            String n3 = Postfix.pop();
            Postfix.push(CalculatePostfix(n3, n4, op));
        }

        return "\nPrefix Expression : " + Prefix.pop() +
                "\nPostfix Expression : " + Postfix.pop();
    }

    private static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }

    private static boolean hasHighPriority(String peek, String ch) {
        if ((peek.equals("+") || peek.equals("-")) && (ch.equals("*") || ch.equals("/"))) {
            return false;
        }
        return true;
    }

    private static String CalculatePrefix(String n1, String n2, String op) {
        return op + " " + n1 + " " + n2;
    }

    private static String CalculatePostfix(String n1, String n2, String op) {
        return n1 + " " + n2 + " " + op;
    }
}



/*
optimized code clean but same TC and SC
 private static String convertToPrefixAndPostfix(String infix) {
        Stack<String> prefix = new Stack<>();
        Stack<String> postfix = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);

            if (ch == '(') {
                operators.push(ch);
            } else if (ch == ')') {
                while (!operators.isEmpty() && operators.peek() != '(') {
                    processStacks(operators, prefix, postfix);
                }
                if (!operators.isEmpty()) {
                    operators.pop(); // pop '('
                }
            } else if (isOperator(ch)) {
                while (!operators.isEmpty() && operators.peek() != '(' &&
                        hasHigherPrecedence(operators.peek(), ch)) {
                    processStacks(operators, prefix, postfix);
                }
                operators.push(ch);
            } else {
                // Operand
                prefix.push(String.valueOf(ch));
                postfix.push(String.valueOf(ch));
            }
        }

        while (!operators.isEmpty()) {
            processStacks(operators, prefix, postfix);
        }

        return "\nPrefix Expression : " + prefix.pop() +
               "\nPostfix Expression : " + postfix.pop();
    }

    private static void processStacks(Stack<Character> operators,
                                      Stack<String> prefix,
                                      Stack<String> postfix) {
        char op = operators.pop();

        String rightPrefix = prefix.pop();
        String leftPrefix = prefix.pop();
        prefix.push(op + " " + leftPrefix + " " + rightPrefix);

        String rightPostfix = postfix.pop();
        String leftPostfix = postfix.pop();
        postfix.push(leftPostfix + " " + rightPostfix + " " + op);
    }

 */

//    private static boolean isOperator(char ch) {
//        return "+-*/".indexOf(ch) != -1;
//        }

//private static boolean hasHigherPrecedence(char op1, char op2) {
//        int p1 = precedence(op1);
//        int p2 = precedence(op2);
//        return p1 >= p2;
//        }

//private static int precedence(char op) {
//        if (op == '+' || op == '-') return 1;
//        if (op == '*' || op == '/') return 2;
//        return 0;
//        }
//        }
// */