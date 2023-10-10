package recursion;

public class AllAlphabetsExceptX {

    public static void main(String[] args) {
        String given = "abnxnajdbabxbxmzmaxxx";
        printAlphabetsExceptX(given, 0);
    }
    private static void printAlphabetsExceptX(String str, int idx){
        if(idx>=str.length())return;
        if(!(str.charAt(idx)=='x' || str.charAt(idx)=='X')){
            System.out.print(str.charAt(idx));
        }
        printAlphabetsExceptX(str, idx+1);
    }
}
