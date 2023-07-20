package TwoPointerApproach;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
//        https://leetcode.com/problems/remove-duplicates-from-sorted-array/

        int [] given = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(given));
        System.out.println(Arrays.toString(given));
    }

    private static int removeDuplicates(int[] nums) {
        // 1st pointer is k
        int k =1;
        // 2nd pointer is i
        for (int i=1; i<nums.length; i++){
            if(nums[i]!=nums[i-1]){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
