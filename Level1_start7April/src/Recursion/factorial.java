package Recursion;
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        System.out.println(findFactorial(n));
    }
    private static int findFactorial(int n){
        if(n==1 || n==0) return 1;
        return n * findFactorial(n-1);
    }
}
