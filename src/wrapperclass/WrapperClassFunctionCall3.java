package wrapperclass;

public class WrapperClassFunctionCall3 {
    public static void main(String[] args) {
        // Example 1
        Integer b = 1;
        fun(b);
        System.out.println(b);
    }

    private static void fun(Integer a){
        a=2;
    }
}
