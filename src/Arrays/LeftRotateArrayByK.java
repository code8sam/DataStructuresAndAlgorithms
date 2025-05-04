package Arrays;

public class LeftRotateArrayByK {
    public static void rotateArray(int[] nums, int k) {
        int n = nums.length;
        k = k%n;

        int [] temp = new int[k];

        for(int i=0; i<k; i++){
            temp[i] = nums[i];
        }
        for(int i=k; i<n; i++){
            nums[i-k] = nums[i];
        }
        for(int i=0; i<k; i++){
            nums[n-k+i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        int k = 2;

        System.out.println("Initial array: ");
        printArray(nums);

        /* Function call to rotate the
        array to the left by k places */
        rotateArray(nums, k);

        System.out.println("Array after rotating elements by " + k + " places: ");
        printArray(nums);
    }
    public static void printArray(int[] nums) {
        for (int val : nums) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
