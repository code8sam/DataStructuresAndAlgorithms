package Arrays;

public class RichestCustomerWealth {
    public static void main(String[] args) {
//        https://leetcode.com/problems/richest-customer-wealth/

        int [][] given = {{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(given));
    }

    private static int maximumWealth(int[][] accounts) {
        int[] allMoney = new int [accounts.length];
        for(int i=0; i<accounts.length; i++) {
            allMoney[i] = checkSum(accounts[i]);
        }
        int maxWealth = max(allMoney);
        return maxWealth;
    }
    private static int max(int[] arrayCol) {
        int max = arrayCol[0];
        for(int i=0; i<arrayCol.length; i++) {
            if(arrayCol[i]>=max) {
                max = arrayCol[i];
            }
        }
        return max;
    }
    private static int checkSum(int[] is) {
        int sum = 0;
        for(int i=0; i<is.length; i++) {
            sum+=is[i];
        }
        return sum;
    }
}
