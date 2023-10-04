package recursion;

public class NumberOfBinaryStringsWithNoConsecutive1s {
    public static void main(String[] args) {
        int given = 4;
        System.out.println(getAns(given));
    }

    private static int getAns(int n) {
        if(n==1) return 2;
        if(n==2) return 3;
        return getAns(n-1)+getAns(n-2);
    }
}
