package recursion;

public class FirstOccurenceInAnArrayUsingRecursion {
    public static void main(String[] args) {
        int[] given = {3, 2, 5, 9, -1, 0};
        int number = 9;
        System.out.println(firstOccur(given, 0, number));
    }

    private static int firstOccur(int[] given, int idx, int number){
        if(idx==given.length) return -1;
        return number==given[idx] ? idx : firstOccur(given, idx+1, number);
    }
}
