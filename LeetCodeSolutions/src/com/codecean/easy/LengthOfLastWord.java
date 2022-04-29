package com.codecean.easy;

public class LengthOfLastWord {

	public static void main(String[] args) {
		String s = "My name      is       Ravi";
		
//		if(s==null || !s.equals(" ")) {
//			return;
//		}
		
		String changeStr = s.replaceAll("[ ]+", " ");
        String [] arrayStr = changeStr.split(" ");
        System.out.println((arrayStr[arrayStr.length-1]).length());
	}

}








// LeetCode here -

//public int lengthOfLastWord(String s) {
//    String changeStr = s.replaceAll("[ ]+", " ");
//    String [] arrayStr = changeStr.split(" ");
//    int number = (arrayStr[arrayStr.length-1].length());
//    return number;
//}
