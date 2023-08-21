package StringAndStringBuilder;

public class SubstringOfAString {
    public static void main(String[] args) {
        String given = "code";
        subString(given);
    }
    private static void subString(String given){
        for (int si=0; si<given.length(); si++){
            for (int ei=si+1; ei<=given.length(); ei++){
                System.out.println(given.substring(si, ei));
            }
        }
    }
}
