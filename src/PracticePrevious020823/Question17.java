package PracticePrevious020823;

public class Question17 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] result = runningSum(arr);
        for (int element : result){
            System.out.print(element+" ");
        }
    }
    private static int[] runningSum(int[]nums){
        int[] result = new int[nums.length];
        result[0] = nums[0];
        for (int i=1; i<nums.length; i++){
            result[i] = result[i-1]+nums[i];
        }
        return result;
    }
}
