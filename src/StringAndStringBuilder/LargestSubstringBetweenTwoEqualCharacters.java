package StringAndStringBuilder;

public class LargestSubstringBetweenTwoEqualCharacters {
    public static void main(String[] args) {
        String given = "mgntdygtxrvxjnwksqhxtxtrv";
        System.out.println(largestSubstring(given));
    }
    private static int largestSubstring(String given){
        int[] indices = new int[26];
        int maxLen = -1;

        for (int i=0; i<given.length(); i++){
            int idx = given.charAt(i)-'a';
            if(indices[idx]>0){
                maxLen = Math.max(maxLen, i-indices[idx]);
            }else{
                indices[idx] = i+1;
            }
        }
        return maxLen;
    }
}
