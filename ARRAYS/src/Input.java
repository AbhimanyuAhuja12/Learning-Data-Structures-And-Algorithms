import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int [] arr=new int[5];
//        arr[0]=12;
//        arr[1]=125;
//        arr[2]=152;
//        arr[3]=62;
//        arr[4]=72;
//        System.out.println(arr[3]);
//        for input in array , we have to use for loop
//
        for (int i = 0; i< arr.length ; i++) {
            arr[i]=input.nextInt();
        }
//        similarly for output in for loop , we have to use foo loop too
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] +" ");}
        System.out.println("\n");
//            for (int j : arr) {
//                System.out.println(j);
//            }
        System.out.println(Arrays.toString(arr));
}
}
