package Arrays;

import java.util.ArrayList;

public class SubarrayOfArray {
    public static void main(String[] args) {
        int [] given = {1, 2, 3, 4};
        ArrayList<ArrayList<Integer>> ans = allSubArr(given);
        for (ArrayList<Integer> element : ans){
            for (Integer value : element){
                System.out.print(value + " ");
            }
            System.out.println();
        }

    }

    private static ArrayList<ArrayList<Integer>> allSubArr(int[] given) {
        int len = given.length;
        ArrayList<ArrayList<Integer>> subArrs = new ArrayList<ArrayList<Integer>>();
        for (int i=0; i<len; i++){
            for (int j=i; j<len; j++) {
                ArrayList<Integer> subArr = new ArrayList<Integer>();
                for (int x=i; x<=j; x++){
                    subArr.add(given[x]);
                }
                subArrs.add(subArr);
            }
        }
        return subArrs;
    }
}
