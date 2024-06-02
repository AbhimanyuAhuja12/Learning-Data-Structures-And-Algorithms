package Ques;

public class CountZeroes {
    public static void main(String[] args) {
        int n = 30204;
        System.out.println(Count(n, 0));
    }

    static int Count(int n, int count) {
        if (n == 0) {
            return count;
        }
        if (n % 10 == 0) {
            return Count(n / 10, count+1);
        }
 return Count(n/10,count);
    }
}
