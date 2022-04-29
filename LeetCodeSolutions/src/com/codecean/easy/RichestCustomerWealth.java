package com.codecean.easy;

public class RichestCustomerWealth {
	
public static int maximumWealth(int[][] accounts) {
	
	int arrayCol [] = new int [accounts.length];
			
	for(int i=0 ; i<accounts.length ; i++) {
		
		arrayCol[i] = check(accounts[i]);
	}
	
	int maxWealth = max(arrayCol);
	
	return maxWealth;
        
        
    }

private static int max(int[] arrayCol) {
	
	int max = arrayCol[0];
	for(int i=0;i<arrayCol.length;i++) {
		if(arrayCol[i]>max) {
			max=arrayCol[i];
		}
	}
	return max;
}

private static int check(int[] is) {
	
	int sum = 0;
	for(int i=0;i<is.length;i++) {
		sum+=is[i];
	}
	return sum;
}

public static void main (String[]args) {
	
	int [][]accounts = {{1,2,3},{3,2,1}};
	
	System.out.println(maximumWealth(accounts));
	
}

}
