package Arrays;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 2, 3, 3};
        int unique = removeDuplicates(nums);
        System.out.println(unique);
    }
    public static int removeDuplicates(int[] nums) {
        Set<Integer> container = new TreeSet<>();
        for(int i=0; i<nums.length; i++){
            container.add(nums[i]);
        }
        int j = 0;
        for(int elem : container){
            nums[j++] = elem;
        }
        return container.size();
    }
}
