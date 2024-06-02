public class max_sum_of_subarray_ofsizek {
    public static void main(String[] args) {
        int []arr={2,5,1,8,2,9,1};
        System.out.println(max_sum_subarray(arr,3));

    }

    static int max_sum_subarray(int[] arr,int k) {
        int start = 0;//i
        int end = 0;//j
        int sum=0;
        int max=Integer.MIN_VALUE;
        while(end<arr.length){
            sum=sum +arr[end];
            if(end-start+1<k){
                end++;
            }
            else if(end-start+1==k){
                max=Math.max(max,sum);
                sum=sum-arr[start];
                start++;
                end++;
            }
        }return max;
    }
}
