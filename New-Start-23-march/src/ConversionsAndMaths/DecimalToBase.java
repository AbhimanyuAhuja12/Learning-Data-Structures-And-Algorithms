package Conversions;

import java.util.Scanner;

public class DecimalToBase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int base = input.nextInt();
        System.out.println(ConvertDecimalToBase(num, base));

    }


    public static int ConvertDecimalToBase(int num, int base) {
        int ans = 0;
        int power = 1;
        while (num != 0) {
            int rem = num % base;
            ans += rem * power;
            power *= 10;
            num /= base;
        }
        return ans;
    }
}
