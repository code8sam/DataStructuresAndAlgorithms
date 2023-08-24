package StringAndStringBuilder;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWordsInAString {
    public static void main(String[] args) {
        String given = "  hello      world  ";
        System.out.println(reverseWords(given));
    }
    private static String reverseWords(String s){
        s = s.replaceAll("[ ]+", " ").trim();
        String[] sInList = s.split(" ");
        StringBuilder builder = new StringBuilder();
        for (int i=sInList.length-1; i>=0; i--){
            builder.append(sInList[i]);
            if(i!=0){
                builder.append(" ");
            }
        }
        return builder.toString();
    }

//    private static String reverseWords(String s) {
//        // remove leading and trailing spaces
//        s = s.trim();
//        // split -> divides the string and puts
//        // elements into array based
//        // on delimiter condition
//        // \s+ is a regular expression for one or more spaces
//        List<String> wordList = Arrays.asList(s.split("\\s+"));
//        // reverses the elements of the list
//        Collections.reverse(wordList);
//        // returns a string separated by a space
//        return String.join(" ", wordList);
//    }


}
