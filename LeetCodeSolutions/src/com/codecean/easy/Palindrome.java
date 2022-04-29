package com.codecean.easy;

public class Palindrome {
	
	public boolean isPalindrome(int x) {
        int temp=x;
        int rem=0;
        int result=0;
        while(x>0) {
        	rem=x%10;
            result = (result*10)+rem;
            x=x/10;
        }
        if(result==temp)
        	return true;
        else
        	return false;
    }

}
