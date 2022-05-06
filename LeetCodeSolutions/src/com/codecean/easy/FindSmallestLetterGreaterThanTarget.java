package com.codecean.easy;

public class FindSmallestLetterGreaterThanTarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// letters = ["c","f","j"], target = "a", output = 'c'
		
		char [] letters = {'c','f','j'};
		char target = 'c';
		
		char result = nextGreatestLetter(letters, target);
		System.out.println("hi");
		System.out.println(result);
	}
	
	public static char nextGreatestLetter(char[] letters, char target) {
		
		int start = 0;
		int end = letters.length-1;
		
		
		while(start<=end) {
			
		  int mid = start+(end-start)/2;
			
		  if(target<letters[mid]) {
			  end=mid-1;
		  }else if(target>letters[mid]) {
			  start=mid+1;
		  }}
		return letters[start%letters.length];
        
    }

}
