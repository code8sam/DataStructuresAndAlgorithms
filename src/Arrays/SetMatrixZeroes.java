package Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class SetMatrixZeroes {
    public static void main(String[] args) {
        int[][] given = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        HashSet<Integer> rowKey = new HashSet<>();
        HashSet<Integer> colKey = new HashSet<>();

        for (int i = 0; i < given.length; i++) {
            for (int j = 0; j < given[i].length; j++) {
                if (given[i][j] == 0) {
                    rowKey.add(i);
                    colKey.add(j);
                }
            }
        }

        for (Integer elem : rowKey) {
            for (int y = 0; y < given[0].length; y++) {
                given[elem][y] = 0;
            }
        }

        for (Integer elem : colKey) {
            for (int x = 0; x < given.length; x++) {
                given[x][elem] = 0;
            }
        }

        for (int[] elem : given) {
            System.out.println(Arrays.toString(elem));
        }
    }
}
