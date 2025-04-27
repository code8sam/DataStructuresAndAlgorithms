package Arrays;

public class MaxConsecutive1s {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1){
                count++;
                max = max<count ? count : max;
            }else{
                count=0;
            }
        }
        return max;
    }
}
