package Maths;

public class SetBit {
    public static void main(String[] args) {
        int n=10;
        int k=2;
        System.out.println(Integer.toBinaryString(setTheBitTo1(n,k)));
    }public static int setTheBitTo1(int n, int k){
        return n | (1<<k);
    }
}
