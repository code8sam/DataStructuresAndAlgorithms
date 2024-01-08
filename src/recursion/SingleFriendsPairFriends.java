package recursion;

public class SingleFriendsPairFriends {
    public static void main(String[] args) {
        int given = 4;
        int result = f(given);
        System.out.println(result);
    }

    private static int f(int n){
        if(n==1 || n==2){
            return n;
        }
        return f(n-1)+(n-1)*f(n-2);
    }
}
