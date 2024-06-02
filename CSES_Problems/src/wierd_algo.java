import java.util.Scanner;

public class wierd_algo
{    public static void main(String[] args) {
    Scanner input =new Scanner(System.in);
    long n=Integer.parseInt(input.nextLine());
    while(n!=1){
        if(n%2==0){
            n/=2;
        }else{
            n=(n*3)+1;
        }
        System.out.print(" "+n);
    }
}
}


