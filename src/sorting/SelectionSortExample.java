package sorting;

public class SelectionSortExample {

    public static int[] selectionSort(int[] nums) {
        for(int i=0; i<nums.length-1; i++){
            int min = i;
            for(int j=i+1; j<nums.length; j++){
                min = nums[j]<nums[min] ? j : min;
            }
            if(min!=i){
                int temp = nums[i];
                nums[i] = nums[min];
                nums[min] =temp;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = {7, 5, 9, 2, 8};

        System.out.print("Original array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // function call for selection sort
        int[] sortedArr = selectionSort(arr);

        System.out.print("Sorted array: ");
        for (int num : sortedArr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}


