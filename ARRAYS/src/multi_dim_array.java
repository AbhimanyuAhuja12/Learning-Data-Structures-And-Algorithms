import java.util.Arrays;
import java.util.Scanner;

public class multi_dim_array {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter dimension of array");
        int n=input.nextInt();
        int [][] arr =new int[n][n];
        for(int row=0;row<n;row++){
            for(int col=0;col<n;col++){
                arr[row][col]=input.nextInt();
            }
        }
//        System.out.println(Arrays.deepToString(arr));
        for(int i=0;i<n;i++){
            for (int j = 0; j <n ; j++) {
                System.out.println(arr[i][j]);

            }
        }
    }
}
