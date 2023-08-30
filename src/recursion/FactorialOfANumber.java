package recursion;

public class FactorialOfANumber {
    public static void main(String[] args) {
        int given = 5;
        System.out.println(factorial(given));
    }
    private static int factorial(int given){
        if(given==1 || given==0){
            return 1;
        }
        return given*factorial(given-1);
    }
}
