package recursion;

public class MaxElemFromArrUsingRecursion {
    public static void main(String[] args) {
        int[] given = {3,1,6,9,21,0,-1};
        System.out.println(maxElemOfArr(given, 0));
    }

    private static int maxElemOfArr(int[] arr, int idx) {
        int max = arr[idx];
        if (idx==arr.length-1) return arr[idx];
        if (max<maxElemOfArr(arr, idx+1)) {
            return max = maxElemOfArr(arr, idx+1);
        }
        return max;
    }
}
