public class findIthbit {
    public static void main(String[] args) {
        int n=1011110010;
        int place =5;
        System.out.println(tellbit(n,place));
        System.out.println(Integer.toBinaryString(tellbit(n,place)));

    }public static int tellbit(int n,int place){
        return n & 1<<(place-1);
    }
}
