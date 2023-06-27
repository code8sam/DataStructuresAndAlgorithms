package IntroTopics;

public class MethodOverloading {

    public static void main(String[] args) {
        System.out.println(addNumbers(2,3));
    }

    public static int addNumbers(int num1, int num2) {
        int addedNumber = num1 + num2;
        return addedNumber;
    }
    public static long addNumbers(long num1, long num2) {
        long addedNumber = num1 + num2;
        return addedNumber;
    }
}
