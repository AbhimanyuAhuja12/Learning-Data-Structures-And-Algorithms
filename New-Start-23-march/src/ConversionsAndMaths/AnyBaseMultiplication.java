package ConversionsAndMaths;

import java.util.Scanner;

public class AnyBaseMultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number in given base: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number in given base: ");
        int num2 = input.nextInt();

        System.out.print("Enter the base: ");
        int base = input.nextInt();
        input.close();

        System.out.println("Result in base " + base + ": " + getMultiplication(num1, num2, base));
    }

    public static int getMultiplication(int num1, int num2, int base) {
        int ans = 0;
        int power = 1; // Tracks place value (units, tens, etc.)

        while (num2 > 0) {
            int digit2 = num2 % 10;
            num2 /= 10;

            // Multiply num1 by digit2
            int singleProduct = multiplySingleDigit(num1, digit2, base);

            // Add properly in the base system
            ans = addInBase(ans, singleProduct * power, base);
            power *= 10;
        }

        return ans;
    }

    public static int multiplySingleDigit(int num1, int digit2, int base) {
        int carry = 0, ans = 0, power = 1;

        while (num1 > 0 || carry > 0) {
            int digit1 = num1 % 10;
            num1 /= 10;

            int product = digit1 * digit2 + carry;
            carry = product / base;
            product = product % base;

            ans += product * power;
            power *= 10;
        }

        return ans;
    }

    public static int addInBase(int num1, int num2, int base) {
        int ans = 0, carry = 0, power = 1;

        while (num1 > 0 || num2 > 0 || carry > 0) {
            int digit1 = num1 % 10;
            int digit2 = num2 % 10;
            num1 /= 10;
            num2 /= 10;

            int sum = digit1 + digit2 + carry;
            carry = sum / base;
            sum %= base;

            ans += sum * power;
            power *= 10;
        }

        return ans;
    }
}
