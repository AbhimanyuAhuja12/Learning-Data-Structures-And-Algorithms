import java.util.Arrays;
import java.util.Stack;

public class InfixToPrefix {
    public static void main(String[] args) {
        String exp = "(A+B)*C-D+F";
        System.out.println(infixToPrefix(exp));
    }

    public static String infixToPrefix(String exp) {

        StringBuilder ans = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        char[] arr = exp.toCharArray();

        reverse(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ')') {
                arr[i] = '(';
                i++;
            }
            if (arr[i] == '(') {
                arr[i] = ')';
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));


        for(char ch : arr){
            if (Character.isLetterOrDigit(ch)) {
                ans.append(ch);

            } else if (ch == '(') {
                stack.push(ch);

            } else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    ans.append(stack.pop());
                }
                stack.pop();

            } else {
                if (ch == '^') {
                    while (!stack.isEmpty() && priority(stack.peek()) >= priority(ch)) {
                        ans.append(stack.pop());
                    }
                } else {
                    while (!stack.isEmpty() && (priority(stack.peek()) > priority(ch))) {
                        ans.append(stack.pop());
                    }
                    stack.push(ch);
                }
            }
        }

        while (!stack.isEmpty()) {
            ans.append(stack.pop());
        }

        char[] result = ans.toString().toCharArray();
        reverse(result);
        return Arrays.toString(result);
    }




    public static int priority(char ch) {
        if (ch == '^') {
            return 3;
        } else if (ch == '*' || ch == '/') {
            return 2;
        } else if (ch == '+' || ch == '-') {
            return 1;
        } else {
            return -1;
        }
    }

    static void reverse(char str[]){
    int start=0;
    int end=str.length-1;
        // Temporary variable to store character
        char temp;
        while (start <= end) {
            // Swapping the first and last character
            temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }

    }
}
