package PracticePrevious020823;

import java.util.ArrayList;

public class Question16 {
    public static void main(String[]args){
        int[]arr1={9,7,6,2};
        int[]arr2={7,7,6};
        System.out.println(sumOfTwoArrays(arr1, arr2));
    }
    private static ArrayList<Integer> sumOfTwoArrays(int[]arr1, int[]arr2){
        ArrayList<Integer> ans = new ArrayList<>();
        int i = arr1.length-1;
        int j = arr2.length-1;
        int carry = 0;
        while(i>=0 || j>=0){
            int sum = 0;
            if(i>=0){
                sum+=arr1[i];
            }
            if(j>=0){
                sum+=arr2[j];
            }
            sum+=carry;

            int rem = sum%10;
            carry = sum/10;
            ans.add(0,rem);
            i--;
            j--;
        }
        if(carry!=0){
            ans.add(0, carry);
        }
        return ans;
    }
}
