package PracticePrevious020823;

public class Question20 {
    public static void main(String[] args) {
        int [][] given = {{2,4,-1},{-10,5,11},{18,-7,6}};
        transpose(given);
        for (int elementArr[] : given){
            for (int element : elementArr){
                System.out.print(element+" ");
            }
            System.out.println();
        }
    }
    private static void transpose(int[][]given){
        int rows = given.length;
        int cols = given[0].length;
        for (int i=0; i<rows; i++){
            for(int j=i+1; j<cols; j++){
                int temp = given[i][j];
                given[i][j] = given[j][i];
                given[j][i] = temp;
            }
        }
    }
}
