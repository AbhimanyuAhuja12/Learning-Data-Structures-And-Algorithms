package ConversionsAndMaths;

import java.util.Scanner;

public class AnyBaseAddition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        System.out.print("Enter the base: ");
        int base = input.nextInt();

        input.close();

        System.out.println(ManualAddition(num1, num2, base));
    }

    public static int ManualAddition(int num1, int num2, int base) {
        int ans = 0;
        int carry = 0;
        int power = 1;

        while (num1 != 0 || num2 != 0 || carry != 0) {
            int digit1 = num1 % 10;
            int digit2 = num2 % 10;

            int digitSum = digit1 + digit2 + carry;
            carry = digitSum / base;

            digitSum = digitSum % base;
            ans += digitSum * power;

            power *= 10;
            num1 /= 10;
            num2 /= 10;
        }

        return ans;
    }
    /*
    you can also do one thing that first convert both the numbers to decimal and
    than normally add them and later convert them into their base again
     */
}
