package Basics;
import java.util.Scanner;

/*
constraints
1<= T <=10000
1<= n <= 10^9
*/

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

    /*
    for(int i =0 ;i<T ;i++){
      int n = input.nextInt();
      int count =0;

      for(int div =2;div*div<=n;div++){
          if(n%div==0){
            count++;
            break;
          }
      }

      if(count==0) System.out.println("Prime No");
      else System.out.println("Not prime);
    }


     */
}
