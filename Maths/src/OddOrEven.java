import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
//        int n=87;
        Scanner input =new Scanner(System.in);
        System.out.println("input number");
        int n=input.nextInt();
//        if((n & 1)==1){
//            System.out.println("odd");
//        }else{
//            System.out.println("even");
//        }
        System.out.println(isOdd(n));
    }
    public static boolean isOdd(int n){
        return (n&1)==1;
    }
}
