package recursion;

public class ApowerB {
    public static void main(String[] args) {
        int a=2, b=3;
        System.out.println(power(a, b));
    }

    private static int power(int a, int b){
        if(b==0){
            return 1;
        }
        return a*power(a, b-1);
    }
}
