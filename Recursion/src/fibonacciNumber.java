public class fibonacciNumber {
    public static void main(String[] args) {
        System.out.println(fibo(5));
    }
    static int fibo( int n){
//        base condn
        if(n<2){
            return n;
        }

        return fibo(n-1)+fibo(n-2);
    }
}
