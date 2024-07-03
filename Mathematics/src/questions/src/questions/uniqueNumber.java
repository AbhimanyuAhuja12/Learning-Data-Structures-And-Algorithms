package questions;

import java.util.Arrays;

public class uniqueNumber {
    public static void main(String[] args) {
        int[] arr ={1,1,1,2,2,2,4,12,12,12};

        System.out.println(findSingle(arr));
    }

    public static int findSingle(int[] nums) {
        Arrays.sort(nums); // Sort the array

        for (int i = 0; i < nums.length; i += 3) {
            // If we reach the last element or the current element is not equal to the next element
            if (i == nums.length - 1 || nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        return -1;
    }
}
