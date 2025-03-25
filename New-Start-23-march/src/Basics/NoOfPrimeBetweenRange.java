package Basics;
import java.util.Scanner;

/*
constraints
2<low<high<10^6
*/

public class NoOfPrimeBetweenRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int low = input.nextInt();
        int high = input.nextInt();
        input.close();

        for (int i = low; i <=high; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int num) {

        for (int div = 2; div * div <= num; div++) {
            if (num % div == 0) {
                return false;
            }

        }

        return true;
    }
}
