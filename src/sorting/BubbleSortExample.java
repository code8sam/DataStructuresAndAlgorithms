package sorting;

import java.util.Arrays;

public class BubbleSortExample {

    public static int[] bubbleSort(int[] nums) {
        int n = nums.length;
        for(int i=n-1; i>=0; i--){
            boolean isSwapped = false;
            for(int j=0; j<=i-1; j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    isSwapped = true;
                }
            }
            if(!isSwapped){
                break;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {7, 4, 1, 5, 3};
        System.out.println("Array Before Using Bubble Sort: " + Arrays.toString(nums));
        // Function call for Bubble Sort
        nums = bubbleSort(nums);
        System.out.println("Array After Using Bubble Sort: " + Arrays.toString(nums));
    }
}
