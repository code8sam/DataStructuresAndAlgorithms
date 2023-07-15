package Arrays;

public class DiagonalSumOfMatrix {
    public static void main(String[] args) {
//        https://leetcode.com/problems/matrix-diagonal-sum/

        int [][] given = {{1,2,3},
                {4,5,6},
                {7,8,9}};
        System.out.println(diagonalSum(given));
    }
    private static int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            // Add elements from primary diagonal.
            sum += mat[i][i];
            // Add elements from secondary diagonal.
            sum += mat[n - 1 - i][i];
        }
        // If n is odd, subtract the middle element as its added twice.
        if (n % 2 != 0) {
            sum -= mat[n / 2][n / 2];
        }

        return sum;
    }
}
