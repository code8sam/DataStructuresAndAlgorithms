package com.codecean.easy;

public class TwoSum {
	
	 public static int[] twoSum(int[] nums, int target) {
         int result [] = new int [2];
		 for(int i=0;i<nums.length;i++) {
			 for(int j=0;j<nums.length;j++) {
				if(j!=-1 && j!=i && nums[i]+nums[j]==target) {
					result [0] = j;
					result [1] = i;
					break;
				} 
			 }
		 }
		 return result;
    }
}
