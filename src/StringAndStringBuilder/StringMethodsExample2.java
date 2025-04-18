package StringAndStringBuilder;

import java.sql.SQLOutput;
import java.util.Arrays;

public class StringMethodsExample2 {
    public static void main(String[] args) {
        // creating Strings
        String str1 = "Hello World !";
        String str2 = new String("Java Programming");
        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        String str3 = new String(charArray);

        // basic methods

        // length() : returns the number of characters
        System.out.println("Length : " + str1.length());
        // isEmpty() : checks if String is empty :
        System.out.println("Is empty ? : " + str1.isEmpty());
        // charAt() : gets character at an index
        System.out.println("char at an index 1 : " + str1.charAt(1));

        // searching in String

        // indexOf() : first occurence of 'o' (after an index)
        System.out.println("First index of 'o' : " + str1.indexOf('o'));
        // lastIndexOf() : last index of 'o'
        System.out.println("Last index of 'o' : " + str1.lastIndexOf('o'));
        // index of substring
        System.out.println("Index of 'World' : " + str1.lastIndexOf("World"));
        // contains() : checks if string contains substring
        System.out.println("Contains 'Hello' ? : " + str1.contains("Hello"));
        // startsWith() : checks prefix
        System.out.println("Starts with 'Hello' ? : " + str1.startsWith("Hell"));
        // endsWith() : checks suffix
        System.out.println("Ends with '!' : " + str1.endsWith("!"));

        // String Comparison

        // equals() : checks exact match
        System.out.println("Equals ? : " + str1.equals("Hello World !"));
        // equalsIgnoreCase() : ignore case and checks exact match
        System.out.println("Equals Ignore Case ? : " + str1.equalsIgnoreCase("hello world !"));
        // compareTo() : lexicographical comparison
        System.out.println("compareTo ? : " + str1.compareTo("Hello World !"));
        // compareToIgnoreCase() : ignores case and then lexicographically compare
        System.out.println("CompareToIgnoreCase ? : " + str1.compareToIgnoreCase("hello world"));
        // matches() : regex match
        System.out.println("Matches regex ? : " + str1.matches(".*World.*"));

        // extract substrings

        // substring() : extracts part of the string
        System.out.println("Substring (7 to end) : " + str1.substring(7));
        // extracts specific range
        System.out.println("Substring (1, 5) : " + str1.substring(0, 5));

        // string modify

        // toLowerCase()
        System.out.println("To Lowercase : " + str1.toLowerCase());
        // toUpperCase()
        System.out.println("To Uppercase : " + str1.toUpperCase());
        // trim() : removes leading and trailing spaces
        System.out.println("Trim : " + "     Java     is Fun".trim());
        // replace() : replaces all occurrences of 'o' with 'X'
        System.out.println("Replace 'o' with 'X' : " + str1.replace('o', 'X'));
        // replaceAll() : replaces using regex
        System.out.println("After replacing all space with single space : " + "    Hello    Java   !".replaceAll("[ ]+", " "));


        // String splitting and joining

        // split()
        String in = "This is    the showdown   ";
        String[] split = in.split("[ ]+");
        System.out.println("String in array : " + Arrays.toString(split));
        // join()
        System.out.println("Join words with - : " + String.join("-", split));
    }
}
