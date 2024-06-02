public class function_call {
    public static void main(String[] args) {
        print1(1);
    }
    static void print1(int n){
        System.out.println(n);
        print2(2);
    }

    private static void print2(int i) {
        print3(3);
        System.out.println(i);
    }

    private static void print3(int i) {
        System.out.println(3);
    }
}
