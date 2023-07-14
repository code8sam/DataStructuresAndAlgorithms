package Arrays;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {

//        https://leetcode.com/problems/remove-element/

        int [] given = {3,2,2,3};
        int value = 3;
        System.out.println(removeElement(given, value));
        System.out.println(Arrays.toString(given));
    }

    private static int removeElement(int[] nums, int val) {
        int len = nums.length;
        int j = 0;
        for (int i =0; i<len; i++){
            if(val!=nums[i]){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
        return j;
    }
}
