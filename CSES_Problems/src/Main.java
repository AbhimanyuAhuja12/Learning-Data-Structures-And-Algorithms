import java.util.Scanner;


public class Main {
        public static void main(String[] args) {
            Scanner input =new Scanner(System.in);
            long n=Integer.parseInt(input.nextLine());
            while(n!=1) {
                System.out.print(n + " ");
                if (n % 2 == 0) {
                    n /= 2;
                } else {
                    n = (n * 3) + 1;
                }
            }
                System.out.print(n);
            }
        }

