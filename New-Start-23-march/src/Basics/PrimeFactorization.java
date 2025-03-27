package Basics;

import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        input.close();

        /*

        while (num != 1) {
            int div = 0;
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    div = i;
                    break;
                }
            }
            if (div == 0) div = num;
            System.out.println(div);
            num = num / div;
        }

        /*/
     // TC: O(√n)
          for (int i = 2; i * i <= num; i++) {  // Check divisibility up to √num
            while (num % i == 0) {  // While divisible by i
                System.out.println(i);
                num /= i;
            }
        }
        if (num != 1) {  // If num is still greater than 1, it's a prime factor
            System.out.println(num);
        }
}
}
