import java.util.Scanner;

public class pratice {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        for(int i = 1; i <=2*n; i++) {
            if(i<=n) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
            }if(i>n){
                for (int j = 0; j <2*n-i; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
