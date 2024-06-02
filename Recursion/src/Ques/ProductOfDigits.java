package Ques;

public class ProductOfDigits {
    public static void main(String[] args) {
        int n=505;
        System.out.println(Product_Digits(n));

    }static int Product_Digits(int n){
        if(n%10==n){
            return n;
        } return n%10 * Product_Digits((n/10));
    }
}
