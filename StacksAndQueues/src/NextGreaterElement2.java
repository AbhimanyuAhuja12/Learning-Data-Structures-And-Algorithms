import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement2 {
    public static void main(String[] args) {
       int[] nums1 ={2,4};
       int[] nums2 = {1,2,3,4};
        System.out.println(Arrays.toString(NGE(nums1,nums2)));
    }

    public static int[] NGE(int[]arr1,int[]arr2){
        Stack <Integer> stack = new Stack<>();
        int[] nge = new int[arr2.length];

        for(int i=arr2.length-1;i>=0;i--){
            while(!stack.isEmpty() && arr2[i]>=stack.peek()){
                stack.pop();
            }
            nge[i]= stack.isEmpty() ? -1 :stack.peek();

            stack.push(arr2[i]);
        }

        for (int i = 0; i < arr1.length; i++) {
            int target = arr1[i];
            // Find the index of arr1[i] in arr2 and update arr1 with its next greater element
            for (int j = 0; j < arr2.length; j++) {
                if (arr2[j] == target) {
                    arr1[i] = nge[j];
                    break;
                }
            }
        }

        return arr1;
    }
}
