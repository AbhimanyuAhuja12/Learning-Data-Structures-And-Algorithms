package demo;

public class ceiling_of_a_number {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target =15;
        int ans = ceiling(arr, target);
        System.out.println(ans);

    }
        static int ceiling ( int[] arr, int target){
            int start = 0;
            int end = arr.length - 1;
            while (start < end) {
                int mid = start + (end - start) / 2;
                if(target>arr[end]){
                    return -1;
                }
                if (arr[mid] < target) {
                    start = mid + 1;
                } else if (arr[mid] > target) {
                    end = mid;
                } else {
                    return mid;
                }



            }return arr[start];
        }
    }

