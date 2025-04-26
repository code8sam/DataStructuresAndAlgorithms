package Arrays;

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
}
