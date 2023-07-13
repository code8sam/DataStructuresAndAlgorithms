package Arrays;

import java.util.HashSet;

public class ContainsDuplicate {
    // OPTIMISED APPROACH :
    public static void main(String[] args) {
        int [] given = {1,2, 3, 1};
        System.out.println(containsDuplicate(given));
    }
    private static boolean containsDuplicate(int[] nums) {
        boolean duplicate = false;
        HashSet<Integer> forCheck = new HashSet<>();
        for(int element : nums){
            if(!(forCheck.add(element))){
                duplicate = true;
            }
        }
        return duplicate;
    }
}
