package StringAndStringBuilder;

public class LargestOddNumberInString {
    public static void main(String[] args) {
        String num = "52";
        System.out.println(largestOddNumber(num));
    }
    private static String largestOddNumber(String num){
        for(int index = num.length()-1; index>=0; index--){
            if(num.charAt(index)%2!=0){
                return num.substring(0, index+1);
            }
        }
        return "";
    }
}
