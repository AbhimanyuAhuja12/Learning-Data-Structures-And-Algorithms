public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int a = 45;
        int b =100;
        swap(a,b);
        System.out.println(a);
        System.out.println(b);;
    }
    public static void swap(int first , int second){
        int temp = first;
        first = second;
        second=temp;
    }
}