package ConversionsAndMaths;

import java.util.Scanner;

public class SubtractBaseToBase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        System.out.print("Enter the base: ");
        int base = input.nextInt();

        input.close();

//        if (num1 < num2) {
//            int temp = num2;
//            num2 = num1;
//            num1 = temp;
//        }

        System.out.println(ManualSubtraction(num1, num2, base));
    }

    public static int ManualSubtraction(int num1, int num2, int base) {
        int ans = 0;
        int borrow = 0;
        int power = 1;

        while (num1 != 0) {
            int digit1 = num1 % 10;
            int digit2 = num2 % 10;
            num1 /= 10;
            num2 /= 10;

            int newDigit = 0;
            digit1 = digit1 + borrow;

            if (digit1 >= digit2) {
                newDigit = digit1 - digit2;
                borrow = 0;
            } else {
                borrow = -1;
                newDigit = (digit1 + base) - digit2;
            }
            ans += newDigit * power;
            power *= 10;
        }

        return ans;
    }
}