package questions;

public class CountSetbits {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(tellNoOfBits(n));
    }

    public static int tellNoOfBits(int n) {
        int count = 0;
//        while (n > 0) {
//            n = n & (n - 1);
//            count++;
//    }

        while(n>0){
            n-= n & (-n);
            count++;
        }
        return count;
    }
}
