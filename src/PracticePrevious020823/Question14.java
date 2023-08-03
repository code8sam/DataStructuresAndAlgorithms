package PracticePrevious020823;

import java.util.Arrays;

public class Question14 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k=3;
        rotateArr(nums,k);
        System.out.println(Arrays.toString(nums));
    }
    private static void rotateArr(int[]nums, int k){
        if(k<0){
            k=k+nums.length;
        }

        k=k%nums.length;

        reverse(nums, 0, nums.length-k-1);
        reverse(nums, nums.length-k, nums.length-1);
        reverse(nums, 0, nums.length-1);
    }
    private static void reverse(int[]arr, int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
