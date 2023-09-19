package recursion;

public class FibonacciUsingRecursion {
    public static void main(String[] args) {
        int given = 4;
        System.out.println(fibonacci(given));
    }

    private static int fibonacci(int n) {
        if(n==0 || n==1){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
