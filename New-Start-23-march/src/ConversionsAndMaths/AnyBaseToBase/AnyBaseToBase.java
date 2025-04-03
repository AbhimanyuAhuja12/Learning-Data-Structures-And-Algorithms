package Conversions;

import java.util.Scanner;

public class AnyBaseToBase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int base1 = input.nextInt();
        int base2 = input.nextInt();
        input.close();

        System.out.println(ConvertAnyBaseToBase(num, base1, base2));
    }

    public static int ConvertAnyBaseToBase(int num, int base1, int base2) {
        if (base1 == base2) return num;

        if (base1 == 10) {
            return ConvertDecimalToBase(num, base2);
        } else if (base2 == 10) {
            return ConvertBaseToDecimal(num, base1);
        } else {
            int decimalValue = ConvertBaseToDecimal(num, base1);
            return ConvertDecimalToBase(decimalValue, base2);
        }
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
