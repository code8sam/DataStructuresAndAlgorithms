package recursion;

public class SubsequecneOfAStringUsingRecursion {

    public static void main(String[] args) {
        String given = "abc";
        subsequence(given, 0, "");
    }

    private static void subsequence(String str, int idx, String output){
        if(idx==str.length()){
            System.out.print("["+output+"]"+ " ");
            return;
        }
        subsequence(str, idx+1, output+str.charAt(idx));
        subsequence(str, idx+1, output);
    }
}
