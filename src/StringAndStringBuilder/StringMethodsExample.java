package StringAndStringBuilder;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class StringMethodsExample {
    public static void main(String[] args) {
        // creating Strings
        String str1 = "Hello, World !";
        String str2 = new String("Java Programming");
        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        String str3 = new String(charArray);

        // basic methods

        // 1. length() : returns the number of characters
        System.out.println("Length : " + str1.length());
        // 2. isEmpty() : checks if String is empty
        System.out.println("Is empty : " + str1.isEmpty());
        // 3. charAt() : gets character at an index
        System.out.println("char at index 1 : " + str1.charAt(1));

        // Searching in String

        // 4. indexOf() : first occurrence of 'o' (after an index)
        System.out.println("First Index of 'o' : " + str1.indexOf('o'));
        System.out.println("Index of 'o' : " + str1.indexOf('o', 3));
        // 5. lastIndexOf() : last occurence of 'o'
        System.out.println("Last Index of 'o' : " + str1.lastIndexOf('o'));
        // 6. indexOf() : index of substring
        System.out.println("Index of 'World' : " + str1.indexOf("World"));
        // 7. contains() : checks if string contains substring
        System.out.println("Contains 'Hello' ? : " + str1.contains("Hello"));
        // 8. startsWith() : checks prefix
        System.out.println("Starts with 'Hell' ? : " + str1.startsWith("Hell"));
        // 9. endsWith() : checks suffix
        System.out.println("Ends with '!' ? : " + str1.endsWith("!"));

        // String Comparison

        // 10. equals() : checks exact match
        System.out.println("Equals ? : " + str1.equals("Hello, World !"));
        // 11. equalsIgnoreCase() : ignores case and checks exact match
        System.out.println("Equals Ignore Case ? : " + str1.equalsIgnoreCase("hello, world !"));
        // 12. compareTo() : Lexicographical Comparison
        System.out.println("compareTo : " + str1.compareTo("Hello, Universe !"));
        // 13. compareToIgnoreCase() : ignores case and then Lexicographical Comparison
        System.out.println("compareToIgnoreCase : " + str1.compareToIgnoreCase("hello, WorlD !"));
        // 14. matches() : regex match
        System.out.println("Matches Regex (.*World.*) ? : " + str1.matches(".*World.*"));

        // Extracting Substrings

        // 15. substring() : extracts part of the string
        System.out.println("Substring (7 to end) : " + str1.substring(7));
        // 16. substring() : extracts specific range
        System.out.println("Substring (0 to 5) : " + str1.substring(0, 5));

        // String Modification

        // 17. toLowerCase() : coverts to lowercase
        System.out.println("To lowercase : " + str1.toLowerCase());
        // 18. toUpperCase() : converts to uppercase
        System.out.println("To uppercase : " + str1.toUpperCase());
        // 19. trim() : removes leading and trailing spaces
        System.out.println("Trim : " + "    Java  ".trim());
        // 20. replace() : replaces all occurences of ('o' with 'X')
        System.out.println("Replace 'o' with 'X' : " + str1.replace('o', 'X'));
        // 21. replaceAll() : replaces using regex
        System.out.println("replaceAll [regex 'l+'] : " + str1.replaceAll("l+", "L"));
        // 22. replaceFirst() : replaces first match only
        System.out.println("replaceFirst [regex 'l+'] : " + str1.replaceFirst("l+", "L"));

        // String splitting and joining

        // 23. split() : splits string by (', ')
        String[] words = str1.split(", ");
        System.out.println("Split by ', ' : " + Arrays.toString(words));
        // 24. join() : joins array elements with ('-')
        System.out.println("Join words with '-' : " + String.join("-", words));

        // Conversion between Strings and Arrays

        // 25. getBytes() : converts String to byte array
        byte[] byteArray = str1.getBytes(StandardCharsets.UTF_8);
        System.out.println("Get bytes : " + Arrays.toString(byteArray));
        // 26. toCharArray() : converts string to character array
        char[] charArray2 = str1.toCharArray();
        System.out.println("To charArray : " + Arrays.toString(charArray2));

        // Formatting and valueOf

        // 27. format() : format String with placeholders
        System.out.println("Formatted String : " + String.format("Hello %s ! Hello %s ! ...", "Brother", "Sister"));
        // 28. valueOf() : converts given value's datatype to String and returns the value
        System.out.println("Value of int : " + String.valueOf(100));
        System.out.println("Value of double : " + String.valueOf(3.14));
        System.out.println("Value of boolean : " + String.valueOf(true));
        System.out.println("Value of charArray : " + String.valueOf(new char[]{'J', 'a', 'v', 'a'}));

        // String Interning

        // 29. intern() : moves String to String Pool
        String s1 = new String("InternedString").intern();
        String s2 = "InternedString";
        System.out.println("Interned equals : " + (s1==s2));

        // Checking types

        // 30. isBlank() : true because it has only spaces
        System.out.println("Is blank : " + "   ".isBlank());
        // 31. isEmpty() : true because it's empty
        System.out.println("Is empty : " + "".isEmpty());

        // 31. StringBuilder Interoperability
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("StringBuilder to String : " + sb.toString());
    }
}
