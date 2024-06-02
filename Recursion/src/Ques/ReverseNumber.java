package Ques;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(Reverse(4321));
    }static int Reverse(int n){
        if(n<10){
            return n;
        }
        return (n%10)*10 + Reverse(n/10);
    }
}
