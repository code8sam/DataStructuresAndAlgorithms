package recursion;

public class Pattern1UsingRecursion {

    private static void printPatternForRow(int n){
        if(n<=0) return;
        System.out.print("*");
        printPatternForRow(n-1);
    }

    private static void printPattern(int n, int k){
        if(n<=0) return;
        printPatternForRow(k);
        System.out.println();
        printPattern(n-1, k);
    }

    public static void main(String[] args) {
        int n =6;
        printPattern(n, n);
    }
}
