package recursion;

public class Pattern1UsingRecursionBetterApproach {

    private static void printPattern(int row, int col, int k){
        if(row>k)return;
        if(col>k){
            System.out.println();
            printPattern(row+1, 1, k);
            return;
        }
        System.out.print("*");
        printPattern(row, col+1, k);
    }

    public static void main(String[] args) {
        int n =6;
        printPattern(1,1, n);
    }
}
