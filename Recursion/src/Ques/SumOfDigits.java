package Ques;

public class SumOfDigits {
    public static void main(String[] args) {
        int digit=134219;
        System.out.println(Digit_Sum(digit));
    }
    static int Digit_Sum(int n){
        if(n==0){
            return 0;
        }
        return n%10+Digit_Sum((n/10));
    }
}
