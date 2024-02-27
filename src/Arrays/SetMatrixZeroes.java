package Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class SetMatrixZeroes {
    public static void main(String[] args) {
        int given [][] = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        setMatrixZeroes(given);
    }
    public static void setMatrixZeroes(int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;
        boolean isRow = false;
        boolean isCol = false;

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j]==0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                    if(i==0) isRow =true;
                    if(j==0) isCol = true;
                }
            }
        }
        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    // the curr row is bound to become 0 or
                    // the col is bound to become 0
                    matrix[i][j]=0;
                }
            }
        }
        if(isRow){
            for(int i=0; i<n; i++){
                matrix[0][i] = 0;
            }
        }
        if(isCol){
            for(int i=0; i<m; i++){
                matrix[i][0] = 0;
            }
        }
        for(int[] arr : matrix){
            System.out.println(Arrays.toString(arr));
        }
    }

//              BRUTE FORCE APPROACH

//    public static void main(String[] args) {
//        int[][] given = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
//        HashSet<Integer> rowKey = new HashSet<>();
//        HashSet<Integer> colKey = new HashSet<>();
//
//        for (int i = 0; i < given.length; i++) {
//            for (int j = 0; j < given[i].length; j++) {
//                if (given[i][j] == 0) {
//                    rowKey.add(i);
//                    colKey.add(j);
//                }
//            }
//        }
//
//        for (Integer elem : rowKey) {
//            for (int y = 0; y < given[0].length; y++) {
//                given[elem][y] = 0;
//            }
//        }
//
//        for (Integer elem : colKey) {
//            for (int x = 0; x < given.length; x++) {
//                given[x][elem] = 0;
//            }
//        }
//
//        for (int[] elem : given) {
//            System.out.println(Arrays.toString(elem));
//        }
//    }
}
