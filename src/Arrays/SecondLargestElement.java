package Arrays;

import java.util.Arrays;

public class SecondLargestElement {
    public int secondLargestElementBruteForce(int[] nums) {
        if(nums.length == 1) return -1;

        Arrays.sort(nums);
        int largest = nums[nums.length-1];
        int secondLargest = -1;

        for(int i=nums.length-2; i>0; i--){
            if(nums[i]!=largest){
                secondLargest = nums[i];
                break;
            }
        }
        return secondLargest;
    }

    public int secondLargestElementBetterApproach(int[] nums) {
        if(nums.length == 1) return -1;
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){
            if(nums[i]>largest){
                largest = nums[i];
            }
        }

        for(int i=0; i<nums.length; i++){
            if(nums[i]>secondLargest && nums[i]!=largest){
                secondLargest=nums[i];
            }
        }

        return secondLargest==Integer.MIN_VALUE ? -1 : secondLargest;
    }

    public int secondLargestElementOptimised(int[] nums) {
        if(nums.length == 1) return -1;
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){
            if(nums[i]>largest){
                secondLargest = largest;
                largest = nums[i];
            }else if(nums[i]>secondLargest && nums[i]!=largest){
                secondLargest = nums[i];
            }
        }
        return secondLargest==Integer.MIN_VALUE ? -1 : secondLargest;
    }
}
