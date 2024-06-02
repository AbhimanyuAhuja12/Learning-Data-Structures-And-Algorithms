package demo;

public class floor_of_a_number {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target =4;
        int ans = floor(arr, target);
        System.out.println(ans);

    }
    static int floor(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if(target<arr[end]){
                return -1;
            }
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid;
            } else {
                return mid;
            }



        }return end;
    }
}

