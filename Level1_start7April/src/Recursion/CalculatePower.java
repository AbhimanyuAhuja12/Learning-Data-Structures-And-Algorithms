package Recursion;
/*
x^n
 */
public class CalculatePower {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        int x = input.nextInt();
        int n = input.nextInt();

        System.out.println(power(x,n));
    }
    private static int power(int x , int n){
        /*
        these both lines are self sufficent for code
        if(n==1) return x;
        return x * power(x,n-1);
         */
        /*
        linear power
        if(n==0){
            return 1;
        }
        int xnm1 = power(x,n-1);
        int xn = x * xnm1;
        return xn;

         */

        //logarithmic power code
        // no of recursion calls or level is proportional to logn
        // x^n=x^n/2*x^n/2;
        if(n==0){
            return 1;
        }
        int xpnb2 = power(x,n/2);
        int xn = xpnb2 * xpnb2;
        if(n%2==1){
            xn = xn * x;
        }
        return xn;
    }
}
