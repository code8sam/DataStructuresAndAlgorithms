package com.codecean.easy;

public class FindNumbersWithEvenNumberOfDigits {
	
	public static void main (String []args) {
		
		int [] nums = {2,3,5,8,16,10};
		
		int result = findNumbers(nums);
		System.out.println(result);
	}
	
	// Code below - 
	
	public static int findNumbers(int[] nums) {
		
		int count = 0;
		
		for(int i=0;i<nums.length;i++) {
			if(even(nums[i])) {
				count++;
			}
		}
		return count;
        
    }

	// function to check whether a number contains even no. of digits
	
	private static boolean even(int i) {
		
		int count = 0;
		
		while(i>0) {
			count++;
			i=i/10;
		}
		
		if(count%2==0) 
			return true;
		else
			return false;
	}

}
