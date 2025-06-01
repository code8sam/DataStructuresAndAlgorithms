package Arrays;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 2, 3, 3};
        int unique = removeDuplicatesOptimised(nums);
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

    public static int removeDuplicatesOptimised(int[] nums) {
        int n = nums.length;
        if(n==0){
            return 0;
        }
        int i = 0;
        for( int j=1; j<nums.length; j++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
}
