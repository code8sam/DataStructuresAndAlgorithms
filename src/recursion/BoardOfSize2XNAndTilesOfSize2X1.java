package recursion;

public class BoardOfSize2XNAndTilesOfSize2X1 {

    public static void main(String[] args) {
        int given = 4;
        System.out.println(f(given));
    }

    private static int f(int n){
        if(n==0 | n==1 || n==2){
            return n;
        }
        return f(n-1)+f(n-2);
    }
}
