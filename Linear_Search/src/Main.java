public class Main {
    public static void main(String[] args){
        int[]arr={2,4,6,8,3,5,7};
        int target=8;
        int ans=(linear_search(arr,target));
        System.out.println(ans);

    }
    static int linear_search(int[]arr,int target){
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==target){
                return i;
            }
        }return -1;
    }
}