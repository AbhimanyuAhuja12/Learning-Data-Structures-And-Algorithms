package Conversions;

import java.util.Scanner;

public class BaseToDecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int base = input.nextInt();

        System.out.println(ConvertBaseToDecimal(num, base));

    }

    public static int ConvertBaseToDecimal(int num, int base) {
        int ans = 0;
        int power = 1;
        while (num != 0) {
            int rem = num % 10;
            ans += rem * power;
            power *= base;
            num /= 10;
        }
        return ans;
    }
}
