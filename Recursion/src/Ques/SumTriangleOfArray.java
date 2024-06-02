package Ques;
import java.util.Arrays;

public class SumTriangleOfArray {

    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
//        System.out.println(Arrays.toString(ConsecutiveSum(arr)));


            ConsecutiveSum(arr);
        }


   static void ConsecutiveSum(int[]arr){

        int[]ans=new int[arr.length-1];
        if(arr.length<1){
            return;
        }
       for (int i = 0; i <arr.length-1 ; i++) {
int sum=arr[i]+arr[i+1];
ans[i]=sum;
       }

        ConsecutiveSum(ans);

       System.out.println(Arrays.toString(arr));


//        return ans;

    }
}

