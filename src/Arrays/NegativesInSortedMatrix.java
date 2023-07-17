package Arrays;

public class NegativesInSortedMatrix {
//    public static void main(String[]args){
////        https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
//
//        // BRUTE FORCE APPROACH
//
//        int [][] given = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
//        System.out.println(countNegatives(given));
//    }
//    private static int countNegatives(int[][] grid) {
//        int negatives =0;
//        int row = grid.length;
//        int col = grid[0].length;
//        for(int i=0; i<row; i++){
//            for(int j=0; j<col; j++){
//                if(grid[i][j]<0){
//                    negatives++;
//                }
//            }
//        }
//        return negatives;
//    }
    public static void main(String[] args) {
        // OPTIMISED APPROACH : USING BINARY SEARCH

        int [][] given = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        System.out.println(countNegatives(given));
    }

    private static int countNegatives(int[][] given) {
        int negatives =0;
        int row = given.length;
        int col = given[0].length;
        for (int i=0; i<row; i++){
            negatives+=binarySearch(given[i]);
        }
        return negatives;
    }

    private static int binarySearch(int[] arr) {
        // Using binary search find the index
        // which has the first negative element.
        int n = arr.length;
        int count =0;
        int left = 0;
        int right = n - 1;
        while (left <= right) {
            int mid = (right + left) / 2;
            if (arr[mid] < 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        // 'left' points to the first negative element,
        // which means 'n - left' is the number of all negative elements.
        return count = (n - left);
    }

}
