package Arrays;

public class RotateImage {
    public static void main(String[] args) {

        int [][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        rotate(matrix);
    }
    public static void rotate(int[][] matrix) {

        transpose(matrix);

        for (int i=0; i<matrix.length; i++){
            reverse(matrix[i]);
        }

        for(int[] arrElem : matrix){
            for (int element : arrElem){
                System.out.print(element+ " ");
            }
            System.out.println();
        }
    }

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
    private static void reverse(int[] arr) {

        int start = 0;
        int end = arr.length-1;
        while(start<end){
            swap(arr, start, end);
            start++;
            end--;
        }

    }

    private static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }


}
