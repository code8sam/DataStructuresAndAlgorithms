package Arrays;

public class SumOfArrayElements {
    public  int sum(int arr[], int n) {
        // Initialize sum to 0
        int sum = 0;
        // Iterate through each element in the array
        for (int i = 0; i < n; i++) {
            // Add each element to the sum
            sum += arr[i];
        }
        return sum;
    }
}
