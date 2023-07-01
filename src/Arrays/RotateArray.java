package Arrays;

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {

        // https://leetcode.com/problems/rotate-array/

        int [] nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotateArr(nums, k);
        System.out.println(Arrays.toString(nums));
    }

    private static void rotateArr(int[] nums, int k) {
        // in case k is negative
        if(k<0){
            k=k+nums.length;
        }
        // just to ensure the value of k
        // doesn't exceed array length
        k=k%nums.length;

        // reverse first half
        reverse(nums, 0, nums.length - k - 1);
        // reverse second half
        reverse(nums, nums.length - k, nums.length - 1);
        // once both parts are reversed, reverse entire array
        reverse(nums, 0, nums.length - 1);
    }
    public static void reverse(int nums[], int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
