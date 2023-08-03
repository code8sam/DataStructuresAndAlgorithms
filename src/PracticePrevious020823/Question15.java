package PracticePrevious020823;

import java.util.ArrayList;

public class Question15 {
    public static void main(String[] args) {
        int[] arr1 = {10,19,20,30,40,40,40,50};
        int[] arr2 = {15,16,17,18,20,25,30,30,40};
        System.out.println(intersection(arr1, arr2));
    }
    private static ArrayList<Integer> intersection(int[]arr1, int[]arr2) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                ans.add(arr1[i]);
                i++;
                j++;
            }
        }
        return ans;
    }
}
