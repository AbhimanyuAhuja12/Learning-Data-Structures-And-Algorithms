package Maths;
import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int n = input.nextInt();
      findFactors(n);

    }public static void findFactors(int n){
        for (int i = 0; i*i <=n ; i++) {
            System.out.println(i + " "+ n/i );
        }
    }
}
