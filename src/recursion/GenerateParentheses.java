package recursion;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

    public static List<String> result = new ArrayList<>();

    public static void main(String[] args) {
        int given = 3;
        List<String> ans = generateParentheses(given);
        for (String elem : ans){
            System.out.print(elem + " ");
        }

    }

    public static List<String> generateParentheses(int n) {
        result.clear();
        f(n, 0, 0, "");
        return result;
    }

    public static void f(int n, int o, int c, String output) {
        if (c==n){
            result.add(output);
        }
        if(o<n){
            f(n, o+1, c, output+"(");
        }
        if(o>c){
            f(n, o, c+1, output+")");
        }
    }
}
