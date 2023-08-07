package StringAndStringBuilder;

public class ReplaceAscii {
    public static void main(String[] args) {
        String given = "dex";
        System.out.println(replaceAscii(given));
    }
    private static String replaceAscii(String given){
        StringBuilder builder = new StringBuilder(given);
        for (int i=0; i<builder.length(); i++){
            char ch = builder.charAt(i);
            if(i%2==0){
                ch = (char)(ch+1);
                builder.setCharAt(i, ch);
            }else{
                ch = (char)(ch-1);
                builder.setCharAt(i, ch);
            }
        }
        return builder.toString();
    }
}
