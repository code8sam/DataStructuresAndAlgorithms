package recursion;

public class PrintNnaturalnumbersInDecreasing {
    public static void main(String[] args) {
        int n = 5;
        printNNaturalInDec(n);
    }

    private static void printNNaturalInDec(int n) {
        if (n==0) return;
        System.out.println(n);
        printNNaturalInDec(n-1);
    }
}
