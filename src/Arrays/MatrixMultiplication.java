package Arrays;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int arr1 [] [] = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int arr2 [] [] = {
                {1, 1},
                {1, 2},
                {2, 1}
        };
        
        matrixMultiplication(arr1, arr2);
    }

    private static void matrixMultiplication(int[][] arr1, int[][] arr2) {
        int row1 = arr1.length;
        int col1 = arr1[0].length;
        int row2 = arr2.length;
        int col2 = arr2[0].length;

        int ans [][] = new int [row1][col2];

        if(col1!=row2){
            System.out.println("Matrix Multiplication is not possible for these arrays");
            return;
        }

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                for (int k = 0; k < row2; k++) {
                    ans[i][j] += arr1[i][k]*arr2[k][j];
                }
            }
        }
        printMatrix(ans);
    }
    private static void printMatrix(int M[][]) {
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j<M[i].length; j++){
                System.out.print(M[i][j] + " ");
            }
            System.out.println();
        }
    }
}

