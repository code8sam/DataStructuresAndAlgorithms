package Arrays;

public class TransposeOfAMatrix {
    public static void main(String[] args) {
        int [][] given = {
                {2, 4, -1},
                {-10, 5, 11},
                {18, -7, 6}
        };
        transpose(given);
        for (int elementArr[] : given){
            for (int element : elementArr){
                System.out.print(element+ " ");
            }
            System.out.println();
        }
    }

//    private static int[][] transpose(int[][] matrix) {
//        int rows = matrix.length;
//        int cols = matrix[0].length;
//        int ans [][] = new int [cols][rows];
//        for (int i=0; i<rows; i++){
//            for (int j=0; j<cols; j++){
//                ans[j][i] = matrix[i][j];
//            }
//        }
//        return ans;
//    }

    // MUCH BETTER :

    private static void transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int i=0; i<rows; i++){
            for (int j=i+1; j<cols; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}
