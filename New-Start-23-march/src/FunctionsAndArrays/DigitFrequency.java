package FunctionsAndArrays;

import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int digit = input.nextInt();
        System.out.println(getDigitFrequency(num, digit));

    }

    public static int getDigitFrequency(int num, int digit) {
        int count = 0;
        while (num != 0) {
            int rem = num % 10;
            if (rem == digit) count++;
            num /= 10;
        }
        return count;
    }
}
