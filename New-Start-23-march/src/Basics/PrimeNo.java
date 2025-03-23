package Basics;
import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int T = input.nextInt();

        while(T!=0){
            int n = input.nextInt();
            boolean isPrime = true;

            if(n<=1) isPrime = false;
            else if(n%2==0) isPrime=false;
            else {
                for (int i = 3; i * i <= n; i+=2) {
                    if (n % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            System.out.println(isPrime ? "Prime Number " : "Not Prime");

            T--;
        }
        input.close();
    }
}
