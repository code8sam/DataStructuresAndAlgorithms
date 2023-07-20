package TwoPointerApproach;

import java.util.Arrays;

public class Sort0sAnd1sInArray {
    public static void main(String[] args) {
        int [] given = {0,1,1,0,1,1,0,1};
        int [] ans = sort0s1s(given);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] sort0s1s(int[] given) {
        // 1st pointer
        int left = 0;
        // 2nd pointer
        int right = given.length-1;
        while(left<=right){
            if(given[left]==0){
                left++;
            }else{
                swap(given, left, right);
                right--;
            }
        }
        return given;
    }

    private static void swap(int[] given, int left, int right) {
        int temp = given[left];
        given[left] = given[right];
        given[right] = temp;
    }
}
