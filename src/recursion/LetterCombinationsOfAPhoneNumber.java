package recursion;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber {

    public static String[] map = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public static List<String> result = new ArrayList<>();

    public static void f(String str, int idx, String output){
        if(idx==str.length()){
            result.add(output);
            return;
        }
        int digit = str.charAt(idx) - '0';
        for (int k=0; k<map[digit].length(); k++){
            f(str, idx+1, output+map[digit].charAt(k));
        }
    }
    public static List<String> letterCombinations(String digits) {
        result.clear();
        if (digits.length()==0)return result;
        f(digits, 0, "");
        return result;
    }

    public static void main(String[] args) {
        String given = "23";
        List<String> ans = letterCombinations(given);
        for (String elem : ans){
            System.out.print(elem+" ");
        }
    }
}
