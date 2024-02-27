package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int given[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        List<Integer> ans = spiralOrder(given);
        for(Integer elem : ans){
            System.out.print(elem+" ");
        }
    }
    public static List<Integer> spiralOrder(int[][]matrix){
            List<Integer> result = new ArrayList<>();
            int m=matrix.length;
            int n=matrix[0].length;
            int sr=0;
            int ec=n-1;
            int er=m-1;
            int sc=0;
            int count = m*n;

            while(count>0){
                //starting row
                for(int i=sc; i<=ec; i++){
                    result.add(matrix[sr][i]);
                    count--;
                }
                sr++;
                if(count==0) break;

                //ending column
                for(int i=sr; i<=er; i++){
                    result.add(matrix[i][ec]);
                    count--;
                }
                ec--;
                if(count==0) break;

                //ending row
                for(int i=ec; i>=sc; i--){
                    result.add(matrix[er][i]);
                    count--;
                }
                er--;
                if(count==0) break;

                //starting column
                for(int i=er; i>=sr; i--){
                    result.add(matrix[i][sc]);
                    count--;
                }
                sc++;
                if(count==0) break;
            }
            return result;
        }
}
