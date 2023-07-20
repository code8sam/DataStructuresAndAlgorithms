package Arrays;

import java.util.Arrays;

public class TwoSumInputArraySorted {
//    public static void main(String[] args) {
////        https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
//
//        // BRUTE FORCE APPROACH
//
//        int [] given = {2,3,4};
//        int target = 6;
//        System.out.println(Arrays.toString(twoSum(given, target)));
//    }
//    private static int[] twoSum(int[] numbers, int target) {
//        int [] arr = new int [2];
//        for(int i=0; i<numbers.length; i++){
//            for(int j=0; j<numbers.length; j++){
//                if(i!=j && numbers[i]+numbers[j]==target){
//                    arr[0]=j+1;
//                    arr[1]=i+1;
//                }
//            }
//        }
//        return arr;
//    }

    public static void main(String[] args) {

        // OPTIMISED APPROACH : USING 2 POINTERS

        int [] given = {2,3,4};
        int target = 6;
        int ans [] = twoSum(given, target);
        for (int element : ans){
            System.out.print(element+" ");
        }
    }
    private static int[] twoSum(int[] numbers, int target) {
        int [] arr = new int [2];
        // 1st pointer
        int low = 0;
        // 2nd pointer
        int high = numbers.length-1;
        while(low<high){
            int sum = numbers[low]+numbers[high];
            if(sum==target){
                arr[0]=low+1;
                arr[1]=high+1;
                break;
            }else if(sum<target){
                low++;
            }else{
                high--;
            }
        }
        return arr;
    }
}
