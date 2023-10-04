package recursion;

public class PrintArrayRecursively {
    public static void main(String[] args) {
        int[] given = {1, 2, 3, 4};
        int idx = 0;
        printArr(given, idx);
    }
    private static void printArr(int[] given, int idx){
        if(idx>=given.length) return; // base case
        System.out.println(given[idx]); // self work
        printArr(given, idx+1); // recursive assumption
    }
}
