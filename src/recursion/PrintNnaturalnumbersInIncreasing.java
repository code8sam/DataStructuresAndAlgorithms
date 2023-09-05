package recursion;

public class PrintNnaturalnumbersInIncreasing {
    public static void main(String[] args) {
        int n = 5;
        printNNaturalInInc(n);
    }

    private static void printNNaturalInInc(int n) {
        if (n==0) return;
        printNNaturalInInc(n-1);
        System.out.println(n);
    }
}
