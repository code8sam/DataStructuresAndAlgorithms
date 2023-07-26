package StringAndStringBuilder;

public class Palindrome {
    public static void main(String[] args) {
        String name = "naman";
        System.out.println(isPalindrome(name));
    }

    private static boolean isPalindrome(String name){
        int left = 0;
        int right = name.length()-1;
        while(left<right){
            if(name.charAt(left)!=name.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
