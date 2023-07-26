package TwoPointerApproach;

import java.util.Arrays;

public class BoatsToSavePeople {
    public static void main(String[] args) {
//        https://leetcode.com/problems/boats-to-save-people/

        int [] people = {3,5,3,4};
        int limit = 5;
        System.out.println(numberOfBoatsToCarry(people, limit));
    }

    private static int numberOfBoatsToCarry(int[] people, int limit) {
        Arrays.sort(people);
        int boat = 0;
        int low = 0;
        int high = people.length-1;
        while(low<=high){
            boat++;
            if(people[low]+people[high]<=limit){
                low++;
                high--;
            }else{
                high--;
            }
        }
        return boat;
    }
}
