import java.util.Arrays;
import java.util.Stack;

public class NextGreatestElement {
    public static void main(String[] args) {
          int[]arr = {3,10,4,2,1,2,6,1,7,2,9};
        System.out.println(Arrays.toString(NGE(arr)));
    }
    public static int[] NGE(int[] arr){
        Stack<Integer> stack = new Stack<>();
        int[] nge= new int[arr.length];

        for(int i=arr.length-1;i>=0;i--){

            while(!stack.isEmpty() && arr[i]>=stack.peek()){
                stack.pop();
            }

            // If the stack is not empty, the top element is the next greater element
            nge[i] = stack.isEmpty() ? -1 : stack.peek();

            stack.push(arr[i]);








//            if(stack.isEmpty() || stack.peek()<arr[i] ){
//                stack.push(arr[i]);
//            }
//            if(!stack.isEmpty() && arr[i]<stack.peek()){
//                nge[i]=stack.peek();
//            }
//            else{
//                nge[i]=-1;
//            }
        }


        return nge;
    }
}
