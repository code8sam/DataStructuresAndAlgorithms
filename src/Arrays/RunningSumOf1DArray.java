package Arrays;

public class RunningSumOf1DArray {


//    public static void main(String[] args) {
//
//        // BRUTE FORCE APPROACH
//        int arr [] = {1, 2, 3, 4};
//        int result [] = runningSum(arr);
//        for (int element : result) {
//            System.out.print(element+" ");
//        }
//    }
//    private static int[] runningSum(int[] nums) {
//        int ans [] = new int[nums.length];
//        for(int i=0; i<nums.length; i++){
//            ans[i] = runningSumAtIndex(nums, i);
//        }
//        return ans;
//    }
//    private static int runningSumAtIndex(int[] nums, int i) {
//        int sum = 0;
//        for(int x=0; x<=i; x++){
//            sum+=nums[x];
//        }
//        return sum;
//    }

    public static void main(String[] args) {
        // OPTIMISED APPROACH

        int arr[] = {1, 2, 3, 4};
        int result[] = runningSum(arr);
        for (int element : result) {
            System.out.print(element + " ");
        }
    }

    private static int[] runningSum(int[] nums) {
        int result [] = new int[nums.length];
        result[0] = nums[0];
        for(int i=1; i<nums.length; i++){
            result[i] = result[i-1]+nums[i];
        }
        return result;
    }
}
