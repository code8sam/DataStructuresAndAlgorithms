package Arrays;

public class IsArraySorted {
        boolean arraySortedOrNot(int[] arr, int n) {
            // Iterate through the array
            for (int i = 0; i < n - 1; i++) {

                // Compare each element with the next one
                if (arr[i] > arr[i + 1]) {

                /* If any element is greater than the next
                one, the array is not sorted */
                    return false;
                }
            }
            return true; // If no such pair is found, array is sorted
        }
    }
