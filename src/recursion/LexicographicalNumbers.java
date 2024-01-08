package recursion;

import java.util.ArrayList;
import java.util.List;

public class LexicographicalNumbers {
    public static List<Integer> result = new ArrayList<>();

    public static void f(int i, int num){
        if(i<=num){
            if(i!=0){
                result.add(i);
            }
        }else{
            return;
        }
        for (int k=0; k<=9; k++){
            if(i==0 && k==0) continue;
            f(10*i+k, num);
        }
    }

    public static List<Integer> lexicalOrder(int n) {
        result.clear();
        f(0, n);
        return result;
    }

    public static void main(String[] args) {
        int given = 34;
        List<Integer> ans = lexicalOrder(given);
        System.out.print(ans);
    }
}
