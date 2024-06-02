import java.util.Arrays;

public class cyclic_sort {
    public static void main(String[] args) {
        int []arr={11,14,12,13,2,4,6,1,3,5,7,8,9,10};
        cyclicsort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void cyclicsort(int []nums) {
        int i=0;
        while(i<nums.length){
            int correct_index=nums[i]-1;
            if(nums[i]!=nums[correct_index]){
                swap(nums,i,correct_index);
            }else{
                i++;
            }


        }
    }static void swap(int[]arr,int first,int second){
        int temp=arr[second];
        arr[second]=arr[first];
        arr[first]=temp;
    }
}
