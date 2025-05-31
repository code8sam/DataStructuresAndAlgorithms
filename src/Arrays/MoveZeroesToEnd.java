package Arrays;

import java.util.Arrays;

public class MoveZeroesToEnd {
    public static void main(String[] args) {
        int [] nums = {0, 1, 4, 0, 5, 2};
        System.out.println("Before : " + Arrays.toString(nums));
        moveZeroes(nums);
        System.out.println("After : " + Arrays.toString(nums));
    }

    private static void moveZeroes(int[] nums) {
        int n = nums.length;
        int [] temp = new int[n];
        int j = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0){
                temp[j++] = nums[i];
            }
        }
        for(int i=0; i<j; i++){
            nums[i] = temp[i];
        }
        for(int i=j; i<n; i++){
            nums[i] = 0;
        }
    }
    private static void moveZeroesOptimised(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j++] = nums[i];
            }
        }
        while (j < nums.length) {
            nums[j++] = 0;
        }
    }
    
}
