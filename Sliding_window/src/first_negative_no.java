import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

// first negative number in every window of size k
//sliding window problem
public class first_negative_no {
    public static void main(String[] args) {
        int[]arr={-8, 2, 3, -6, 10};
        System.out.println(find(arr,2));


    }
      static int[] find(int[]arr,int k){
        int[]ans=new int[arr.length-k+1];
        int index=0;

        Queue<Integer> q = new LinkedList<>();
        int i=0;
        int j=0;
        while(j<arr.length){
            if(arr[j]<0){
               q.add(arr[j]);
            }
            if(j-i+1<k){
                j++;
            }
            if(-i+1==k){
                if(q.isEmpty()){
                    ans[index++]=0;}
            }else{
                int num= q.peek()
                ans[index++]= num;

                if(num==arr[i]){
                    q.remove();
                }
            }
            i++;

        }return ans;
    }
}
