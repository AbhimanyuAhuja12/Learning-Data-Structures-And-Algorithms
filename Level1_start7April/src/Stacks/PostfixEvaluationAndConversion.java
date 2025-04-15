package stacks;

import java.util.Scanner;
import java.util.Stack;

public class PostfixEvaluationAndConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String expression = input.nextLine();
        System.out.println(EvaluatePostfix(expression));
        System.out.println(ConversionToPreAndInfix(expression));

    }

    //leetcode 150
    public static int EvaluatePostfix(String expression) {
        Stack<Integer> values = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                int second = values.pop();
                int first = values.pop();
                values.push(Calculate(first, second, ch));
            } else {
                values.push(ch - '0');
            }
        }
        return values.pop();
    }

    private static int Calculate(int first, int second, char ch) {
        if (ch == '+') return first + second;
        if (ch == '-') return first - second;
        if (ch == '*') return first * second;
        return first / second;
    }

    private static String ConversionToPreAndInfix(String expression) {
        Stack<String> Infix = new Stack<>();
        Stack<String> Prefix = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                String secondIn = Infix.pop();
                String firstIn = Infix.pop();
                Infix.push(CalculateInfix(firstIn, secondIn, ch));

                String secondPre = Prefix.pop();
                String firstPre = Prefix.pop();
                Prefix.push(CalculatePrefix(firstPre, secondPre, ch));

            } else {
                Infix.push(String.valueOf(ch));
                Prefix.push(String.valueOf(ch));
            }
        }

        return "[" + "Infix:-> " + Infix.pop() + "]" + " " + "[" + " " + "Prefix:-> " + Prefix.pop() + ']';
    }


    private static String CalculatePrefix(String firstPre, String secondPre, char ch) {
        return ch + " " + firstPre + " " + secondPre;
    }

    private static String CalculateInfix(String firstIn, String secondIn, char ch) {
        return "(" + firstIn + " " + ch + " " + secondIn + ")";
    }
}
